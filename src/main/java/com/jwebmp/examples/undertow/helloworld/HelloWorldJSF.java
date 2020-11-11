/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.examples.undertow.helloworld;

import com.guicedee.guicedservlets.undertow.GuicedUndertow;
import com.guicedee.logger.LogFactory;
import com.guicedee.logger.logging.LogColourFormatter;
import com.jwebmp.core.Page;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.Paragraph;

import jakarta.servlet.ServletException;
import java.util.logging.Level;

public class HelloWorldJSF
		extends Page
{
	public HelloWorldJSF()
	{
		super("Hello World!");
		add(new Paragraph("This page was rendered using JWebMP."));
		add(new Paragraph("The faces servlet by default is set to serve at /faces/, but you can change this<br/>"));
		add(new Link<>("faces/index.xhtml").setText("Click Here to visit Faces at the URL"));
	}

	/**
	 * This part runs the web site :)
	 *
	 * @param args
	 *
	 * @throws ServletException
	 */
	public static void main(String[] args) throws Exception
	{
		LogFactory.setLogToConsole(true);
		LogFactory.configureConsoleColourOutput(Level.INFO);
		LogColourFormatter.setRenderBlack(false);
		System.setErr(System.out);
		GuicedUndertow.boot("localhost", 6002);
		LogFactory.getLog("Program")
		          .info("Started");
	}
}
