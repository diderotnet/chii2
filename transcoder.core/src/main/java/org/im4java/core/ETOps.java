/**************************************************************************
/* This class adds all the ET methods to an Operation.
/*
/* Copyright (c) 2009 by Bernhard Bablok (mail@bablokb.de)
/*
/* This program is free software; you can redistribute it and/or modify
/* it under the terms of the GNU Library General Public License as published
/* by  the Free Software Foundation; either version 2 of the License or
/* (at your option) any later version.
/*
/* This program is distributed in the hope that it will be useful, but
/* WITHOUT ANY WARRANTY; without even the implied warranty of
/* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
/* GNU Library General Public License for more details.
/*
/* You should have received a copy of the GNU Library General Public License
/* along with this program; see the file COPYING.LIB.  If not, write to
/* the Free Software Foundation Inc., 59 Temple Place - Suite 330,
/* Boston, MA  02111-1307 USA
/**************************************************************************/

package org.im4java.core;

/**
   This class subclasses Operation and adds methods for all commandline
   options of exiftool.

   <p>This class is automatically generated by the source-code generator of
   im4java.</p>

   @version $Revision: 1.14 $
   @author  $Author: bablokb $
*/

public class ETOps extends Operation {

  //////////////////////////////////////////////////////////////////////////////

  /**
     The protected Constructor. You should only use subclasses of ETOps.
  */

  protected ETOps() {
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -@ to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps readArguments(String pFilename) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-@");

    if (pFilename != null) {
      buf.append(pFilename.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -duplicates to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps allowDuplicates() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-duplicates");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option --duplicates to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps supressDuplicates() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--duplicates");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -binary to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps binary() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-binary");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -coordFormat to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps coordFormat(String pFormat) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-coordFormat");

    if (pFormat != null) {
      buf.append(pFormat.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -dateFormat to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps dateFormat(String pFormat) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-dateFormat");

    if (pFormat != null) {
      buf.append(pFormat.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -decimal to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps decimal() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-decimal");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option --composite to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps composite() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--composite");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -escapeHTML to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps escapeHTML() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-escapeHTML");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -extractEmbedded to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps extractEmbedded() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-extractEmbedded");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -extension to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps extension(String pExtension) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-extension");

    if (pExtension != null) {
      buf.append(pExtension.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option --extension to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps ignoreExtension(String pExtension) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--extension");

    if (pExtension != null) {
      buf.append(pExtension.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -forcePrint to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps forcePrint() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-forcePrint");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -fixBase to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps fixBase(Integer pOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-fixBase");

    if (pOffset != null) {
      buf.append(pOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -fast to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps fast() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-fast");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -groupHeadings to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps groupHeadings(String pHeadings) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("-groupHeadings");

    if (pHeadings != null) {
      buf.append(pHeadings.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -groupNames to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps groupNames(String pHeadings) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("-groupNames");

    if (pHeadings != null) {
      buf.append(pHeadings.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -htmlFormat to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps htmlFormat() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-htmlFormat");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -hex to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps hex() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-hex");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -htmlDump to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps htmlDump(String pOffset) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    buf.append("-htmlDump");

    if (pOffset != null) {
      buf.append(pOffset.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -ignore to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps ignore(String pDirectory) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-ignore");

    if (pDirectory != null) {
      buf.append(pDirectory.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -if to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps ifCondition(String pExpression) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-if");

    if (pExpression != null) {
      buf.append(pExpression.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -json to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps json() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-json");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -pause to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps pause() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-pause");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -long to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps longOutputFormat() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-long");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -latin to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps latin() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-latin");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -list to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps list() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-list");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -listw to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps listw() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-listw");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -listf to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps listf() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-listf");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -listwf to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps listwf() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-listwf");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -listg to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps listg() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-listg");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -listd to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps listd(String pType) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-listd");

    if (pType != null) {
      buf.append(pType.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -ignoreMinorErrors to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps ignoreMinorErrors() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-ignoreMinorErrors");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -n to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps noPrintConv() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-n");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option --printConv to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps printConv() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("--printConv");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -out to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps out(String pFile) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-out");

    if (pFile != null) {
      buf.append(pFile.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -overwrite_original to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps overwrite_original() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-overwrite_original");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -overwrite_original_in_place to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps overwrite_original_in_place() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-overwrite_original_in_place");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -printFormat to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps printFormat(String pFormat) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-printFormat");

    if (pFormat != null) {
      buf.append(pFormat.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -preserve to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps preserve() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-preserve");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -quiet to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps quiet() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-quiet");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -recurse to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps recurse() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-recurse");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -short to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps shortOutputFormat() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-short");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -veryShort to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps veryShortOutputFormat() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-veryShort");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -scanForXMP to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps scanForXMP() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-scanForXMP");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -separator to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps separator(String pSeparator) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-separator");

    if (pSeparator != null) {
      buf.append(pSeparator.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -tab to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps tab() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-tab");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -table to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps table() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-table");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -tagsFromFile to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps tagsFromFile(String pSrcFile) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-tagsFromFile");

    if (pSrcFile != null) {
      buf.append(pSrcFile.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -unknown to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps unknown() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-unknown");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -unknown2 to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps unknown2() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-unknown2");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -verbose to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps verbose() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-verbose");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -ver to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps ver() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-ver");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -textOut to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps textOut(String pOutspec) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-textOut");

    if (pOutspec != null) {
      buf.append(pOutspec.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -exclude to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps exclude(String pTagName) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-exclude");

    if (pTagName != null) {
      buf.append(pTagName.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -xmlFormat to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps xmlFormat() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-xmlFormat");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -zip to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps zip() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-zip");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -common_args to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps common_args() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-common_args");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -execute to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps execute() {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-execute");

    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }

  //////////////////////////////////////////////////////////////////////////////

  /**
     Add option -srcfile to the exiftool commandline
     (see the documentation of exiftool for details).
  */

  public ETOps srcfile(String pFormat) {

    String       oper;                      // only used in some methods
    StringBuffer buf = new StringBuffer();  // local buffer for option-args
    iCmdArgs.add("-srcfile");

    if (pFormat != null) {
      buf.append(pFormat.toString());
    }
    if (buf.length()>0) {
      iCmdArgs.add(buf.toString());
    }
    return this;
  }


}
