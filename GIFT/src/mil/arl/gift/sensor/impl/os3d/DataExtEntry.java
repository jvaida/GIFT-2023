/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.sensor.impl.os3d;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;
import com.sun.jna.Union;

/**
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 **/
@SuppressWarnings("all")
public class DataExtEntry extends Union {

    // / C type : unsigned char[256]
    public byte[] bData = new byte[256];
    // / C type : _SW_4
    public _SW_4 SW_4;
    // / C type : _SW_4*
    public DataExtEntry._SW_4.ByReference LPSW_4;
    // / C type : _RFID
    public _RFID RFID;
    // / C type : _RFID*
    public DataExtEntry._RFID.ByReference LPRFID;
    // / C type : _DIN16
    public _DIN16 DIN16;
    // / C type : _DIN16*
    public DataExtEntry._DIN16.ByReference LPDIN16;

    public static class _SW_4 extends Structure {
        // / C type : signed short[4]
        public short[] ssSwitch = new short[4];

        public _SW_4() {
            super();
        }

        protected List<String> getFieldOrder() {
            return Arrays.asList("ssSwitch");
        }

        // / @param ssSwitch C type : signed short[4]
        public _SW_4(short ssSwitch[]) {
            super();
            if (ssSwitch.length != this.ssSwitch.length)
                throw new IllegalArgumentException("Wrong array size !");
            this.ssSwitch = ssSwitch;
        }

        public static class ByReference extends _SW_4 implements
                Structure.ByReference {

        };

        public static class ByValue extends _SW_4 implements Structure.ByValue {

        };
    };

    public static class _RFID extends Structure {
        // / C type : unsigned char[8 * 2]
        public byte[] bRFID = new byte[8 * 2];

        public _RFID() {
            super();
        }

        protected List<String> getFieldOrder() {
            return Arrays.asList("bRFID");
        }

        // / @param bRFID C type : unsigned char[8 * 2]
        public _RFID(byte bRFID[]) {
            super();
            if (bRFID.length != this.bRFID.length)
                throw new IllegalArgumentException("Wrong array size !");
            this.bRFID = bRFID;
        }

        public static class ByReference extends _RFID implements
                Structure.ByReference {

        };

        public static class ByValue extends _RFID implements Structure.ByValue {

        };
    };

    public static class _DIN16 extends Structure {
        public short wDDIN;
        public short wDAIN5;
        public short wDAIN6;
        public short wDAIN7;
        public short wDAIN8;

        public _DIN16() {
            super();
        }

        protected List<String> getFieldOrder() {
            return Arrays.asList("wDDIN", "wDAIN5", "wDAIN6", "wDAIN7",
                    "wDAIN8");
        }

        public _DIN16(short wDDIN, short wDAIN5, short wDAIN6, short wDAIN7,
                short wDAIN8) {
            super();
            this.wDDIN = wDDIN;
            this.wDAIN5 = wDAIN5;
            this.wDAIN6 = wDAIN6;
            this.wDAIN7 = wDAIN7;
            this.wDAIN8 = wDAIN8;
        }

        public static class ByReference extends _DIN16 implements
                Structure.ByReference {

        };

        public static class ByValue extends _DIN16 implements Structure.ByValue {

        };
    };

    public DataExtEntry() {
        super();
    }

    // / @param LPDIN16 C type : _DIN16*
    public DataExtEntry(DataExtEntry._DIN16.ByReference LPDIN16) {
        super();
        this.LPDIN16 = LPDIN16;
        setType(DataExtEntry._DIN16.ByReference.class);
    }

    // / @param LPRFID C type : _RFID*
    public DataExtEntry(DataExtEntry._RFID.ByReference LPRFID) {
        super();
        this.LPRFID = LPRFID;
        setType(DataExtEntry._RFID.ByReference.class);
    }

    // / @param LPSW_4 C type : _SW_4*
    public DataExtEntry(DataExtEntry._SW_4.ByReference LPSW_4) {
        super();
        this.LPSW_4 = LPSW_4;
        setType(DataExtEntry._SW_4.ByReference.class);
    }

    // / @param RFID C type : _RFID
    public DataExtEntry(_RFID RFID) {
        super();
        this.RFID = RFID;
        setType(_RFID.class);
    }

    // / @param SW_4 C type : _SW_4
    public DataExtEntry(_SW_4 SW_4) {
        super();
        this.SW_4 = SW_4;
        setType(_SW_4.class);
    }

    // / @param DIN16 C type : _DIN16
    public DataExtEntry(_DIN16 DIN16) {
        super();
        this.DIN16 = DIN16;
        setType(_DIN16.class);
    }

    // / @param bData C type : unsigned char[256]
    public DataExtEntry(byte bData[]) {
        super();
        if (bData.length != this.bData.length)
            throw new IllegalArgumentException("Wrong array size !");
        this.bData = bData;
        setType(byte[].class);
    }

    public static class ByReference extends DataExtEntry implements
            Structure.ByReference {

    };

    public static class ByValue extends DataExtEntry implements
            Structure.ByValue {

    };
}