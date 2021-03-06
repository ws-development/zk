/* B85_ZK_3700Test.java

	Purpose:
		
	Description:
		
	History:
		Mon Jul 10 12:25:48 CST 2017, Created by jameschu

Copyright (C) 2017 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zktest.zats.test2;

import org.junit.Assert;
import org.junit.Test;

import org.zkoss.zktest.zats.WebDriverTestCase;

/**
 * @author jameschu
 */
public class B85_ZK_3700Test extends WebDriverTestCase {
	@Test
	public void test() throws Exception {
		connect();
		Assert.assertEquals(1, jq("@script").length());
		click(jq("@button"));
		waitResponse();
		Assert.assertEquals(0, jq("@script").length());
	}
}
