CORS support for CXF version 2.x
================================

Apache CXF supports [CORS from 2.5](http://cxf.apache.org/docs/jax-rs-cors.html). This project enables this feature for CXF, version 2.x

Sources of CORS itself are copied from [CXF version 2.7.10](https://github.com/apache/cxf/tree/cxf-2.7.10/rt/rs/security/cors/src/main/java/org/apache/cxf/rs/security/cors).

To make it compatible with version 2.x only method getAnnotationForMethodOrContainingClass from RequestUtil is copied to CrossOriginResourceSharingFilter
because in CXF 2.x RequestUtil doesn't contain this method.
Source of getAnnotationForMethodOrContainingClass is taken from the master version of RequestUtil class.

Version of the project defines against what CXF version is build.

Maven dependency
----------------

		<dependency>
			<groupId>org.jboss.community.cxf</groupId>
			<artifactId>cxf-rt-rs-security-cors-v2x-support</artifactId>
			<version>2.2.11</version>
		</dependency>

