/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.tools.authoring.server.gat.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * The parameters of the query for folders
 *
 * @author jleonard
 */
public class FolderQueryData implements IsSerializable {
    
    /** The user name */
    private String userName;

    /**
     * Default Constructor
     *
     * Required by IsSerializable to exist and be public
     */
    public FolderQueryData() {
    }
    
    public FolderQueryData(String userName) {
    	this.userName = userName;
    }

    /**
     * Gets the user name
     * 
     * @return String The user name.
     */
	public String getUserName() {
		return userName;
	}
}
