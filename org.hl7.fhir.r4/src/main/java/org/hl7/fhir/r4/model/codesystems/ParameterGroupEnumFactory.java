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

public class ParameterGroupEnumFactory implements EnumFactory<ParameterGroup> {

  public ParameterGroup fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("haemodynamic".equals(codeString))
      return ParameterGroup.HAEMODYNAMIC;
    if ("ecg".equals(codeString))
      return ParameterGroup.ECG;
    if ("respiratory".equals(codeString))
      return ParameterGroup.RESPIRATORY;
    if ("ventilation".equals(codeString))
      return ParameterGroup.VENTILATION;
    if ("neurological".equals(codeString))
      return ParameterGroup.NEUROLOGICAL;
    if ("drug-delivery".equals(codeString))
      return ParameterGroup.DRUGDELIVERY;
    if ("fluid-chemistry".equals(codeString))
      return ParameterGroup.FLUIDCHEMISTRY;
    if ("blood-chemistry".equals(codeString))
      return ParameterGroup.BLOODCHEMISTRY;
    if ("miscellaneous".equals(codeString))
      return ParameterGroup.MISCELLANEOUS;
    throw new IllegalArgumentException("Unknown ParameterGroup code '" + codeString + "'");
  }

  public String toCode(ParameterGroup code) {
       if (code == ParameterGroup.NULL)
           return null;
       if (code == ParameterGroup.HAEMODYNAMIC)
      return "haemodynamic";
    if (code == ParameterGroup.ECG)
      return "ecg";
    if (code == ParameterGroup.RESPIRATORY)
      return "respiratory";
    if (code == ParameterGroup.VENTILATION)
      return "ventilation";
    if (code == ParameterGroup.NEUROLOGICAL)
      return "neurological";
    if (code == ParameterGroup.DRUGDELIVERY)
      return "drug-delivery";
    if (code == ParameterGroup.FLUIDCHEMISTRY)
      return "fluid-chemistry";
    if (code == ParameterGroup.BLOODCHEMISTRY)
      return "blood-chemistry";
    if (code == ParameterGroup.MISCELLANEOUS)
      return "miscellaneous";
    return "?";
   }

  public String toSystem(ParameterGroup code) {
    return code.getSystem();
  }

}