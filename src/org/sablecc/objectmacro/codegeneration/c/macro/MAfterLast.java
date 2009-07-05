/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

import java.util.LinkedList;
import java.util.List;

public class MAfterLast {

    private final MFile mFile;

    private final MExpandInsertPart mExpandInsertPart;

    private final List<Object> eTextInsert = new LinkedList<Object>();

    private final List<Object> eInlineText_ParamInsert_TextInsertString = new LinkedList<Object>();

    private final List<Object> eTextInsertDestructor = new LinkedList<Object>();

    MAfterLast(
            MFile mFile,
            MExpandInsertPart mExpandInsertPart) {

        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
        if (mExpandInsertPart == null) {
            throw new NullPointerException();
        }
        this.mExpandInsertPart = mExpandInsertPart;
    }

    public MTextInsert newTextInsert(
            String pName) {

        MTextInsert lTextInsert = new MTextInsert(pName, this.mFile);
        this.eTextInsert.add(lTextInsert);
        return lTextInsert;
    }

    public MInlineText newInlineText() {

        MInlineText lInlineText = new MInlineText();
        this.eInlineText_ParamInsert_TextInsertString.add(lInlineText);
        return lInlineText;
    }

    public MParamInsert newParamInsert(
            String pName) {

        MParamInsert lParamInsert = new MParamInsert(pName, this.mFile);
        this.eInlineText_ParamInsert_TextInsertString.add(lParamInsert);
        return lParamInsert;
    }

    public MTextInsertString newTextInsertString(
            String pName) {

        MTextInsertString lTextInsertString = new MTextInsertString(pName);
        this.eInlineText_ParamInsert_TextInsertString.add(lTextInsertString);
        return lTextInsertString;
    }

    public MTextInsertDestructor newTextInsertDestructor(
            String pName) {

        MTextInsertDestructor lTextInsertDestructor = new MTextInsertDestructor(
                pName);
        this.eTextInsertDestructor.add(lTextInsertDestructor);
        return lTextInsertDestructor;
    }

    private String rFileName() {

        return this.mFile.pFileName();
    }

    private String rName() {

        return this.mExpandInsertPart.pName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  if(m");
        sb.append(rFileName());
        sb.append("->_e");
        sb.append(rName());
        sb.append("_->_size_ > 0) {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  ");
        for (Object oTextInsert : this.eTextInsert) {
            sb.append(oTextInsert.toString());
        }
        sb.append("    sizeString += List_pushback(listString, strdup(");
        if (this.eInlineText_ParamInsert_TextInsertString.size() == 0) {
            sb.append("\"\"");
        }
        for (Object oInlineText_ParamInsert_TextInsertString : this.eInlineText_ParamInsert_TextInsertString) {
            sb.append(oInlineText_ParamInsert_TextInsertString.toString());
        }
        sb.append("));");
        sb.append(System.getProperty("line.separator"));
        sb.append("  ");
        for (Object oTextInsertDestructor : this.eTextInsertDestructor) {
            sb.append(oTextInsertDestructor.toString());
        }
        sb.append("  }");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
