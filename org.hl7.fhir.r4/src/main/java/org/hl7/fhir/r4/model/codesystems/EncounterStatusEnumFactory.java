package org.hl7.fhir.r4.model.codesystems;

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

// Generated on Wed, Jan 30, 2019 16:19-0500 for FHIR v4.0.0

import org.hl7.fhir.r4.model.EnumFactory;

public class EncounterStatusEnumFactory implements EnumFactory<EncounterStatus> {

  public EncounterStatus fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("planned".equals(codeString))
      return EncounterStatus.PLANNED;
    if ("arrived".equals(codeString))
      return EncounterStatus.ARRIVED;
    if ("triaged".equals(codeString))
      return EncounterStatus.TRIAGED;
    if ("in-progress".equals(codeString))
      return EncounterStatus.INPROGRESS;
    if ("onleave".equals(codeString))
      return EncounterStatus.ONLEAVE;
    if ("finished".equals(codeString))
      return EncounterStatus.FINISHED;
    if ("cancelled".equals(codeString))
      return EncounterStatus.CANCELLED;
    if ("entered-in-error".equals(codeString))
      return EncounterStatus.ENTEREDINERROR;
    if ("unknown".equals(codeString))
      return EncounterStatus.UNKNOWN;
    throw new IllegalArgumentException("Unknown EncounterStatus code '" + codeString + "'");
  }

  public String toCode(EncounterStatus code) {
       if (code == EncounterStatus.NULL)
           return null;
       if (code == EncounterStatus.PLANNED)
      return "planned";
    if (code == EncounterStatus.ARRIVED)
      return "arrived";
    if (code == EncounterStatus.TRIAGED)
      return "triaged";
    if (code == EncounterStatus.INPROGRESS)
      return "in-progress";
    if (code == EncounterStatus.ONLEAVE)
      return "onleave";
    if (code == EncounterStatus.FINISHED)
      return "finished";
    if (code == EncounterStatus.CANCELLED)
      return "cancelled";
    if (code == EncounterStatus.ENTEREDINERROR)
      return "entered-in-error";
    if (code == EncounterStatus.UNKNOWN)
      return "unknown";
    return "?";
   }

  public String toSystem(EncounterStatus code) {
    return code.getSystem();
  }

}