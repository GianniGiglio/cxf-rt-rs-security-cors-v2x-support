CORS support for CXF version 2.x
================================

Apache CXF supports [CORS from 2.5](http://cxf.apache.org/docs/jax-rs-cors.html). This project enables this feature for CXF, version 2.x

Sources of CORS itself are copied from [CXF version 2.4.3]

To make it compatible with version 2.x only method getAnnotationForMethodOrContainingClass from RequestUtil is copied to CrossOriginResourceSharingFilter
because in CXF 2.x RequestUtil doesn't contain this method.
Source of getAnnotationForMethodOrContainingClass is taken from the master version of RequestUtil class.

Version of the project defines against what CXF version is build.

