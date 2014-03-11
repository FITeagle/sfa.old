//package org.fiteagle.sfa.xmlrpc;
//
//import static org.junit.Assert.assertNotNull;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.ServletInputStream;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.easymock.EasyMock;
//import org.fiteagle.api.FiteagleUserPublicKey;
//import org.fiteagle.delivery.xmlrpc.FITeagleServlet;
//import org.junit.Before;
//import org.junit.Test;
//
//public class SFAServletTest {
//
//	SFAServlet servlet;
//	@Before
//	public void createTest(){
//		servlet = new SFAServlet();
//	}
//	@Test
//	public void test() {
//		assertNotNull(servlet);
//	}
//
//	
//	@Test
//	public void testDoPost() throws ServletException, IOException{
//		HttpServletRequest req = EasyMock.createMock(HttpServletRequest.class);
//		HttpServletResponse res = EasyMock.createMock(HttpServletResponse.class);
//		res.setCharacterEncoding(EasyMock.anyString());
//		EasyMock.expectLastCall().anyTimes();
//		res.setContentType(EasyMock.anyString());
//		EasyMock.expectLastCall().anyTimes();
//		ServletInputStream inputStream = EasyMock.createMock(ServletInputStream.class);
//		EasyMock.expect(req.getInputStream()).andReturn( inputStream);
//		EasyMock.replay(inputStream);
//		EasyMock.replay(req);
//		EasyMock.replay(res);
//		servlet.doPost(req, res);
//	}
//}
