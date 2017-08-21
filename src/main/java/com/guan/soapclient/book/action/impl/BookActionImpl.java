
package com.guan.soapclient.book.action.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.guan.soapclient.book.action.IBookAction;
import com.guan.soapclient.book.domain.Book;

/**
 * 类说明
 * 
 * @author ****
 * @date 2017年8月21日 新建
 */
@Named
public class BookActionImpl implements IBookAction
{
    @Inject
    private com.guan.soapclient.apapter.book.action.IBookAction wsServerClient;

    @Override
    public List<Book> queryBooksByName( String bookName )
    {

        List<Book> books = wsServerClient.queryBooksByName( bookName );
        System.out.println( "client --- book" );

        return books;
    }

}
