/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.net.api.message;

import mil.arl.gift.common.UserSession;
import mil.arl.gift.common.enums.MessageTypeEnum;
import mil.arl.gift.common.enums.ModuleTypeEnum;

/**
 * This represents a user session message.  It contains the minimal header information for GiFT, in addition
 * to the payload to be encoded/decoded and the learner's user id.
 * 
 * @author mhoffman
 *
 */
public class UserSessionMessage extends Message {    

    /**
     * A fixed user id to use for user session related messages (e.g. create new user, allocate module) that are
     * sent before a user id is obtained.
     */
    public static final Integer PRE_USER_UNKNOWN_ID = -1;

    /** information about the user session (including the unique user id of the learner) the message is associated with */    
    private UserSession userSession; 
    
    /**
     * Class constructor - creates a new message.
     * This constructor is used for creating new messages to send. 
     * 
     * @param messageType - the type of message
     * @param sourceEventId - the event Id generated by the sender
     * @param senderModuleName - name of the module sending the message
     * @param senderAddress - the address of the sender
     * @param senderModuleType - type of module sending the message
     * @param destinationAddress - the destination for the message
     * @param payload - the payload of the message (i.e. not the header)
     * @param userSession - information about the user session (including the unique user id of the learner) 
     *                      the message is associated with
     * @param needsACK - whether or not this message is expecting an ACK upon successful decoding at the destination
     */
    public UserSessionMessage(MessageTypeEnum messageType, int sourceEventId, String senderModuleName, 
            String senderAddress, ModuleTypeEnum senderModuleType, String destinationAddress, Object payload, UserSession userSession, boolean needsACK){
        super(messageType, sourceEventId, senderModuleName, senderAddress, senderModuleType, destinationAddress, payload, needsACK);
        
        setUserSession(userSession);
    }
    
    /**
     * Class constructor - used when decoding a message as the sequence number has already been created.
     * 
     * @param messageType - the type of message
     * @param seqNum - the sequence number created by the sender
     * @param sourceEventId - the event Id generated by the sender
     * @param timeStamp - the time at which the message was originally created
     * @param senderModuleName - name of the module sending the message
     * @param senderAddress - the address of the sender
     * @param senderModuleType - type of module sending the message
     * @param destinationAddress - the destination for the message
     * @param payload - the payload of the message (i.e. not the header)
     * @param userSession - information about the user session (including the unique user id of the learner) 
     *                      the message is associated with
     * @param needsACK - whether or not this message is expecting an ACK upon successful decoding at the destination
     */
    public UserSessionMessage(MessageTypeEnum messageType, int seqNum, int sourceEventId, long timeStamp, String senderModuleName, 
            String senderAddress, ModuleTypeEnum senderModuleType, String destinationAddress, Object payload, UserSession userSession, boolean needsACK){
        super(messageType, seqNum, sourceEventId, timeStamp, senderModuleName, senderAddress, senderModuleType, destinationAddress, payload, needsACK);
        
        setUserSession(userSession);
    }

    /**
     * Return the unique user id of the learner this user session message is about
     * 
     * @return int - the unique GIFT user id
     */
    public int getUserId(){
        return userSession.getUserId();
    }
    
    /**
     * Return the username of the learner
     * 
     * @return String the learner's username.  Can be null if a username was not provided.
     */
    public String getUsername(){
        return userSession.getUsername();
    }
    
    /**
     * Return the experiment id for this session message
     * 
     * @return the unique experiment id.  Will be null if the session is not part of an experiment.
     */
    public String getExperimentId(){
        return userSession.getExperimentId();
    }
    
    /**
     * Set the user session information to accompany this user session message.
     * 
     * @param userSession - information about the user session
     */
    public void setUserSession(UserSession userSession){
        
        if(userSession == null){
            throw new IllegalArgumentException("The user session object can't be null.");
        }
        
        this.userSession = userSession;
    }
    
    /**
     * Return the information about the user session (including the unique user id of the learner) 
     * the message is associated with.
     * 
     * @return UserSession - user session information
     */
    public UserSession getUserSession(){
        return userSession;
    }
    
    @Override
    public Message copyNewDestination(String newDestinationAddress){
        
        Message message = new UserSessionMessage(this.getMessageType(), this.getSourceEventId(), this.getSenderModuleName(), this.getSenderAddress(), 
                this.getSenderModuleType(), newDestinationAddress, this.getPayload(), userSession, this.needsHandlingResponse());
        
        if(isReplyMessage()){
            message.setReplyToSequenceNumber(getReplyToSequenceNumber());
        }
        
        return message;
    }

    @Override
    public String toString(){

        StringBuffer sb = new StringBuffer();
        sb.append("[UserSessionMessage: ");
        sb.append("userId = ").append(getUserId());
        sb.append(", username = ").append(getUsername());
        sb.append(", experimentId = ").append(getExperimentId());
        sb.append(", ").append(super.toString());
        sb.append("]");

        return sb.toString();
    } 
}
