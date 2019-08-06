module com.jwebmp.examples.undertow.helloworld {

	exports com.jwebmp.examples.undertow.helloworld to com.google.guice;

	requires javax.servlet.api;
	requires java.logging;

	requires undertow.core;
	requires undertow.servlet;

	requires com.jwebmp.core;
	requires com.jwebmp.undertow;

	provides com.jwebmp.core.services.IPage with com.jwebmp.examples.undertow.helloworld.HelloWorld;

	opens com.jwebmp.examples.undertow.helloworld to com.google.guice;
}
