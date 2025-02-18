/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.lms.impl.common;

/**
 * Represents an exception when creating or executing a SPARQL query.
 * 
 * @author Yet Analytics
 *
 */
public class LmsXapiSparqlException extends LmsException {

    private static final long serialVersionUID = 1L;
    
    public LmsXapiSparqlException(String msg) {
        super(msg);
    }
    
    public LmsXapiSparqlException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
