/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.apache.samza.sql.interfaces;

import org.apache.samza.config.Config;
import org.apache.samza.system.SystemStream;


/**
 * Factory that is used to create {@link SamzaRelConverter}
 */
public interface SamzaRelConverterFactory {

  /**
   * Create a {@link SamzaRelConverter}. This method is called when the framework wants to create the
   * {@link SamzaRelConverter} corresponding to the system.
   * @param systemStream the systemStream to create a converter for
   * @param relSchemaProvider the relational schema provider
   * @param config config that is used to create the object
   * @return the object created.
   */
  SamzaRelConverter create(SystemStream systemStream, RelSchemaProvider relSchemaProvider, Config config);
}
