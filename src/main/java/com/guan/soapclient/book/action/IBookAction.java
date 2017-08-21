
package com.guan.soapclient.book.action;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.guan.soapclient.book.domain.Book;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年8月21日 新建
 */

@Path( "/book" )
@Produces( MediaType.APPLICATION_JSON )
public interface IBookAction
{
    @GET
    @Path( "/{bookName}" )
    List<Book> queryBooksByName( @PathParam( "bookName" ) String bookName );
}
