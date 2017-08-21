
package com.guan.soapclient.apapter.book.action;
/**  
* 类说明   
*  
* @author ****  
* @date 2017年8月21日  新建  
*/

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.guan.soapclient.book.domain.Book;

@WebService( targetNamespace = "http://action.book.soapserver.guan.com/" )
public interface IBookAction
{
    @WebMethod( )
    List<Book> queryBooksByName(
            @WebParam( name = "bookName" ) String bookName );

}
