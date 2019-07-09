import com.jwebmp.core.services.IPage;
import com.jwebmp.examples.undertow.helloworld.HelloWorld;

module com.jwebmp.examples.undertow.helloworld {

	exports com.jwebmp.examples.undertow.helloworld to com.google.guice;

	requires javax.servlet.api;
	requires java.logging;

	requires undertow.core;
	requires undertow.servlet;

	requires com.jwebmp.core;
	requires com.jwebmp.undertow;

	provides IPage with HelloWorld;

	opens com.jwebmp.examples.undertow.helloworld to com.google.guice;
}
