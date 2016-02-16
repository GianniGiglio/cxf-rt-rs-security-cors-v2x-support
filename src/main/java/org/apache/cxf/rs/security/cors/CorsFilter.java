package org.apache.cxf.rs.security.cors;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.cxf.jaxrs.ext.ResponseHandler;
import org.apache.cxf.jaxrs.model.OperationResourceInfo;
import org.apache.cxf.message.Message;

public class CorsFilter implements  ResponseHandler{

	@Override
	public Response handleResponse(Message m, OperationResourceInfo ori, Response response) {
		ResponseBuilder rbuilder = Response.fromResponse(response);
		rbuilder.header("Access-Control-Allow-Origin", "*")
        .header(CorsHeaderConstants.HEADER_AC_ALLOW_HEADERS, "origin, content-type, accept, authorization")
        .header(CorsHeaderConstants.HEADER_AC_ALLOW_CREDENTIALS, "true")
        .header(CorsHeaderConstants.HEADER_AC_ALLOW_METHODS, "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		return rbuilder.build();
	}
}
