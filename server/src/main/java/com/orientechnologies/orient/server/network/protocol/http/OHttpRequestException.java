/*
  *
  *  *  Copyright 2014 Orient Technologies LTD (info(at)orientechnologies.com)
  *  *
  *  *  Licensed under the Apache License, Version 2.0 (the "License");
  *  *  you may not use this file except in compliance with the License.
  *  *  You may obtain a copy of the License at
  *  *
  *  *       http://www.apache.org/licenses/LICENSE-2.0
  *  *
  *  *  Unless required by applicable law or agreed to in writing, software
  *  *  distributed under the License is distributed on an "AS IS" BASIS,
  *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  *  *  See the License for the specific language governing permissions and
  *  *  limitations under the License.
  *  *
  *  * For more information: http://www.orientechnologies.com
  *
  */
package com.orientechnologies.orient.server.network.protocol.http;

import com.orientechnologies.common.exception.OException;

public class OHttpRequestException extends OException {

  private static final long serialVersionUID = 12132321321321L;

  public OHttpRequestException() {
    super();
  }

  public OHttpRequestException(String message, Throwable cause) {
    super(message, cause);
  }

  public OHttpRequestException(String message) {
    super(message);
  }

  public OHttpRequestException(Throwable cause) {
    super(cause);
  }
}
