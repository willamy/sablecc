/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.intermediate.macro;

import java.util.LinkedList;
import java.util.List;

public class MExpandInsertPart {

    private final String pName;

    private final MExpandInsertPart mExpandInsertPart = this;

    private final List<Object> eStringOption_ParamInsertOption_TextInsertOption = new LinkedList<Object>();

    public MExpandInsertPart(
            String pName) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
    }

    public MStringOption newStringOption(
            String pOption,
            String pString) {

        MStringOption lStringOption = new MStringOption(pOption, pString);
        this.eStringOption_ParamInsertOption_TextInsertOption
                .add(lStringOption);
        return lStringOption;
    }

    public MParamInsertOption newParamInsertOption(
            String pOption,
            String pName) {

        MParamInsertOption lParamInsertOption = new MParamInsertOption(pOption,
                pName);
        this.eStringOption_ParamInsertOption_TextInsertOption
                .add(lParamInsertOption);
        return lParamInsertOption;
    }

    public MTextInsertOption newTextInsertOption(
            String pOption) {

        MTextInsertOption lTextInsertOption = new MTextInsertOption(pOption);
        this.eStringOption_ParamInsertOption_TextInsertOption
                .add(lTextInsertOption);
        return lTextInsertOption;
    }

    String pName() {

        return this.pName;
    }

    private String rName() {

        return this.mExpandInsertPart.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  expand_insert {");
        sb.append(System.getProperty("line.separator"));
        sb.append("    name = ");
        sb.append(rName());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        for (Object oStringOption_ParamInsertOption_TextInsertOption : this.eStringOption_ParamInsertOption_TextInsertOption) {
            sb.append(oStringOption_ParamInsertOption_TextInsertOption
                    .toString());
        }
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}