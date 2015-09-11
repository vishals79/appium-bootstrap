/*
 * Copyright 2012-2014 eBay Software Foundation and selendroid committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package appium.android.server;

;
import appium.android.server.http.HttpServer;


public class AndroidServer {
  private int driverPort = 8080;
  private HttpServer webServer;

  public AndroidServer(int port) {
    driverPort = port;
    webServer = new HttpServer(driverPort);
    //init(androidInstrumentation);
  }

  protected void init() {
    //SelendroidDriver driver = new DefaultSelendroidDriver(androidInstrumentation);
    //webServer.addHandler(new AndroidServlet(driver, androidInstrumentation.getExtensionLoader()));
  }

  public void start() {
    webServer.start();
  }

  public void stop() {
    webServer.stop();
  }

  public int getPort() {
    return webServer.getPort();
  }
}
