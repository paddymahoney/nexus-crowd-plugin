/**
 * Copyright (c) 2008 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.nexus.jsecurity.realms.external.crowd;

import java.io.OutputStreamWriter;

import org.junit.Test;
import org.sonatype.nexus.plugins.crowd.config.model.v1_0_0.Configuration;
import org.sonatype.nexus.plugins.crowd.config.model.v1_0_0.io.xpp3.NexusCrowdPluginConfigurationXpp3Writer;

/**
 * @author edelsonj
 * 
 */
public class CrowdUserDataServiceTest {

    @Test
    public void test() throws Exception {
        Configuration config = new Configuration();
        config.setCrowdServerUrl("https://blah");
        new NexusCrowdPluginConfigurationXpp3Writer().write(new OutputStreamWriter(System.out),
                config);
    }

    // @Test
    // public void checkAnonymousAutc() throws Exception {
    // CrowdUserDataService service = new CrowdUserDataService();
    // UsernamePasswordToken token = new UsernamePasswordToken("anonymous",
    // "anonymous");
    // SimpleAuthenticationInfo authInfo = (SimpleAuthenticationInfo)
    // service.authenticate(token,
    // "test");
    // Assert.assertEquals("anonymous",
    // authInfo.getPrincipals().oneByType(String.class));
    // }
    //
    // @Test(expected = IncorrectCredentialsException.class)
    // public void checkBadAnonymousAutc() throws Exception {
    // SecurityServerClient client = createMock(SecurityServerClient.class);
    // expect(client.authenticatePrincipalSimple("anonymous",
    // "anonymous1")).andThrow(
    // new InvalidAuthenticationException());
    // replay(client);
    //
    // CrowdUserDataService service = new CrowdUserDataService();
    // ReflectionHelper.setField(service, "crowdClient", client);
    //
    // UsernamePasswordToken token = new UsernamePasswordToken("anonymous",
    // "anonymous1");
    // service.authenticate(token, "test");
    // }
    //
    // @Test
    // public void checkAnonymousAutz() throws Exception {
    // SecurityUserRoleMapping mapping = new SecurityUserRoleMapping();
    // mapping.addRole("anonymous");
    // mapping.addRole("otherrole");
    //
    // ConfigurationManager mgr = createMock(ConfigurationManager.class);
    // expect(mgr.readUserRoleMapping("anonymous",
    // "default")).andReturn(mapping);
    //
    // ServiceLocator locator = createMock(ServiceLocator.class);
    // expect(locator.lookup(ConfigurationManager.class.getName(),
    // "resourceMerging")).andReturn(
    // mgr);
    //
    // replay(locator, mgr);
    //
    // CrowdUserDataService service = new CrowdUserDataService();
    // service.service(locator);
    //
    // List<String> roles = service.getRoles("anonymous");
    //
    // verify(locator, mgr);
    //
    // Assert.assertEquals(Arrays.asList("anonymous", "otherrole"), roles);
    // }
    //
    // @Test
    // public void checkWhenUsingGroups() throws Exception {
    // String[] returnedGroups = new String[] { "admin", "developer" };
    // SecurityServerClient client = createMock(SecurityServerClient.class);
    // expect(client.findGroupMemberships("username")).andReturn(returnedGroups);
    // replay(client);
    //
    // CrowdUserDataService service = new CrowdUserDataService();
    // ReflectionHelper.setField(service, "useGroups", true);
    // ReflectionHelper.setField(service, "crowdClient", client);
    // service.enableLogging(new ConsoleLogger(Logger.LEVEL_INFO, ""));
    //
    // List<String> roles = service.getRoles("username");
    //
    // verify(client);
    // Assert.assertArrayEquals(returnedGroups, roles.toArray(new String[0]));
    // }
    //
    // @Test
    // public void checkWhenUsingRoles() throws Exception {
    // String[] returnedRoles = new String[] { "admin", "developer" };
    // SecurityServerClient client = createMock(SecurityServerClient.class);
    // expect(client.findRoleMemberships("username")).andReturn(returnedRoles);
    // replay(client);
    //
    // CrowdUserDataService service = new CrowdUserDataService();
    // ReflectionHelper.setField(service, "useGroups", false);
    // ReflectionHelper.setField(service, "crowdClient", client);
    // service.enableLogging(new ConsoleLogger(Logger.LEVEL_INFO, ""));
    //
    // List<String> roles = service.getRoles("username");
    //
    // verify(client);
    // Assert.assertArrayEquals(returnedRoles, roles.toArray(new String[0]));
    // }

}
