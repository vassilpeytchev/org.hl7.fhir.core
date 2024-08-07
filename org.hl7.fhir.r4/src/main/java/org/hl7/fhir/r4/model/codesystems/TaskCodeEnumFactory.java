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

public class TaskCodeEnumFactory implements EnumFactory<TaskCode> {

  public TaskCode fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("approve".equals(codeString))
      return TaskCode.APPROVE;
    if ("fulfill".equals(codeString))
      return TaskCode.FULFILL;
    if ("abort".equals(codeString))
      return TaskCode.ABORT;
    if ("replace".equals(codeString))
      return TaskCode.REPLACE;
    if ("change".equals(codeString))
      return TaskCode.CHANGE;
    if ("suspend".equals(codeString))
      return TaskCode.SUSPEND;
    if ("resume".equals(codeString))
      return TaskCode.RESUME;
    throw new IllegalArgumentException("Unknown TaskCode code '" + codeString + "'");
  }

  public String toCode(TaskCode code) {
       if (code == TaskCode.NULL)
           return null;
       if (code == TaskCode.APPROVE)
      return "approve";
    if (code == TaskCode.FULFILL)
      return "fulfill";
    if (code == TaskCode.ABORT)
      return "abort";
    if (code == TaskCode.REPLACE)
      return "replace";
    if (code == TaskCode.CHANGE)
      return "change";
    if (code == TaskCode.SUSPEND)
      return "suspend";
    if (code == TaskCode.RESUME)
      return "resume";
    return "?";
   }

  public String toSystem(TaskCode code) {
    return code.getSystem();
  }

}