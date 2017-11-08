/*
 * 文件名：MassagerPrinter.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：Administrator
 * 修改时间：2017年11月7日
 */

package com.cheer.spring.helloword;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author Administrator
 * @version 2017年11月7日
 * @see MassagerPrinter
 * @since
 */

public class MessagePrinter
{
    /*下午1:50:33
    2017年11月7日
    */
    private MessageService msgService;
    public void setMsgService(MessageService msgService)
    {
        this.msgService = msgService;
    }
    public void printMessage()
    {
        System.out.println(this.msgService.getMessage());
    }
}
