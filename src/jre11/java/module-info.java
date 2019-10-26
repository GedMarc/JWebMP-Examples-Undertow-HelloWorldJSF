module com.jwebmp.examples.undertow.helloworld.jsf {

	exports com.jwebmp.examples.undertow.helloworld to com.google.guice;

	requires javax.servlet.api;
	requires com.guicedee.guicedservlets.jsf;

	requires java.logging;

	requires jakarta.faces;

	requires undertow.core;
	requires undertow.servlet;

	requires com.jwebmp.core;
	requires com.jwebmp.undertow;
	requires xnio.api;
	requires xnio;

	provides com.jwebmp.core.services.IPage with com.jwebmp.examples.undertow.helloworld.HelloWorldJSF;

	opens com.jwebmp.examples.undertow.helloworld to com.google.guice;
}
