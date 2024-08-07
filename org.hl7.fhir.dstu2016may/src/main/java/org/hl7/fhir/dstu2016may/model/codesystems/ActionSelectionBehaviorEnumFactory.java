package org.hl7.fhir.dstu2016may.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sun, May 8, 2016 03:05+1000 for FHIR v1.4.0

import org.hl7.fhir.dstu2016may.model.EnumFactory;

public class ActionSelectionBehaviorEnumFactory implements EnumFactory<ActionSelectionBehavior> {

  public ActionSelectionBehavior fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("any".equals(codeString))
      return ActionSelectionBehavior.ANY;
    if ("all".equals(codeString))
      return ActionSelectionBehavior.ALL;
    if ("all-or-none".equals(codeString))
      return ActionSelectionBehavior.ALLORNONE;
    if ("exactly-one".equals(codeString))
      return ActionSelectionBehavior.EXACTLYONE;
    if ("at-most-one".equals(codeString))
      return ActionSelectionBehavior.ATMOSTONE;
    if ("one-or-more".equals(codeString))
      return ActionSelectionBehavior.ONEORMORE;
    throw new IllegalArgumentException("Unknown ActionSelectionBehavior code '" + codeString + "'");
  }

  public String toCode(ActionSelectionBehavior code) {
       if (code == ActionSelectionBehavior.NULL)
           return null;
       if (code == ActionSelectionBehavior.ANY)
      return "any";
    if (code == ActionSelectionBehavior.ALL)
      return "all";
    if (code == ActionSelectionBehavior.ALLORNONE)
      return "all-or-none";
    if (code == ActionSelectionBehavior.EXACTLYONE)
      return "exactly-one";
    if (code == ActionSelectionBehavior.ATMOSTONE)
      return "at-most-one";
    if (code == ActionSelectionBehavior.ONEORMORE)
      return "one-or-more";
    return "?";
   }

  public String toSystem(ActionSelectionBehavior code) {
    return code.getSystem();
  }

}