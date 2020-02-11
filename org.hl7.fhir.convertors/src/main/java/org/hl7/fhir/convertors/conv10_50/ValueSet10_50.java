package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertorAdvisor50;
import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.dstu2.model.DateType;
import org.hl7.fhir.dstu2.model.StringType;
import org.hl7.fhir.dstu2.model.UriType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.BooleanType;
import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.model.CodeSystem.CodeSystemContentMode;
import org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionComponent;
import org.hl7.fhir.r5.model.DateTimeType;
import org.hl7.fhir.r5.model.MarkdownType;
import org.hl7.fhir.r5.terminologies.CodeSystemUtilities;
import java.util.List;
import java.util.Collections;

public class ValueSet10_50 {

    public static org.hl7.fhir.r5.model.ValueSet.ConceptReferenceComponent convertConceptReferenceComponent(org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet.ConceptReferenceComponent tgt = new org.hl7.fhir.r5.model.ValueSet.ConceptReferenceComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.r5.model.CodeType) VersionConvertor_10_50.convertType(src.getCodeElement()));
        if (src.hasDisplayElement())
            tgt.setDisplayElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getDisplayElement()));
        if (src.hasDesignation()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionDesignationComponent t : src.getDesignation()) tgt.addDesignation(convertConceptReferenceDesignationComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent convertConceptReferenceComponent(org.hl7.fhir.r5.model.ValueSet.ConceptReferenceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.dstu2.model.CodeType) VersionConvertor_10_50.convertType(src.getCodeElement()));
        if (src.hasDisplayElement())
            tgt.setDisplayElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getDisplayElement()));
        if (src.hasDesignation()) {
            for (org.hl7.fhir.r5.model.ValueSet.ConceptReferenceDesignationComponent t : src.getDesignation()) tgt.addDesignation(convertConceptReferenceDesignationComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ValueSet.ConceptReferenceDesignationComponent convertConceptReferenceDesignationComponent(org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionDesignationComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet.ConceptReferenceDesignationComponent tgt = new org.hl7.fhir.r5.model.ValueSet.ConceptReferenceDesignationComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasLanguageElement())
            tgt.setLanguageElement((org.hl7.fhir.r5.model.CodeType) VersionConvertor_10_50.convertType(src.getLanguageElement()));
        if (src.hasUse()) {
            tgt.setUse(VersionConvertor_10_50.convertCoding(src.getUse()));
        }
        if (src.hasValueElement())
            tgt.setValueElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getValueElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionDesignationComponent convertConceptReferenceDesignationComponent(org.hl7.fhir.r5.model.ValueSet.ConceptReferenceDesignationComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionDesignationComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionDesignationComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasLanguageElement())
            tgt.setLanguageElement((org.hl7.fhir.dstu2.model.CodeType) VersionConvertor_10_50.convertType(src.getLanguageElement()));
        if (src.hasUse()) {
            tgt.setUse(VersionConvertor_10_50.convertCoding(src.getUse()));
        }
        if (src.hasValueElement())
            tgt.setValueElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getValueElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ValueSet.ConceptSetComponent convertConceptSetComponent(org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet.ConceptSetComponent tgt = new org.hl7.fhir.r5.model.ValueSet.ConceptSetComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasSystemElement())
            tgt.setSystemElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_10_50.convertType(src.getSystemElement()));
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getVersionElement()));
        if (src.hasConcept()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ConceptReferenceComponent t : src.getConcept()) tgt.addConcept(convertConceptReferenceComponent(t));
        }
        if (src.hasFilter()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent t : src.getFilter()) tgt.addFilter(convertConceptSetFilterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent convertConceptSetComponent(org.hl7.fhir.r5.model.ValueSet.ConceptSetComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasSystemElement())
            tgt.setSystemElement((org.hl7.fhir.dstu2.model.UriType) VersionConvertor_10_50.convertType(src.getSystemElement()));
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getVersionElement()));
        if (src.hasConcept()) {
            for (org.hl7.fhir.r5.model.ValueSet.ConceptReferenceComponent t : src.getConcept()) tgt.addConcept(convertConceptReferenceComponent(t));
        }
        if (src.hasFilter()) {
            for (org.hl7.fhir.r5.model.ValueSet.ConceptSetFilterComponent t : src.getFilter()) tgt.addFilter(convertConceptSetFilterComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent convertConceptSetFilterComponent(org.hl7.fhir.r5.model.ValueSet.ConceptSetFilterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasPropertyElement())
            tgt.setPropertyElement((org.hl7.fhir.dstu2.model.CodeType) VersionConvertor_10_50.convertType(src.getPropertyElement()));
        if (src.hasOp()) {
            tgt.setOp(convertFilterOperator(src.getOp()));
        }
        if (src.hasValueElement())
            tgt.setValueElement((org.hl7.fhir.dstu2.model.CodeType) VersionConvertor_10_50.convertType(src.getValueElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ValueSet.ConceptSetFilterComponent convertConceptSetFilterComponent(org.hl7.fhir.dstu2.model.ValueSet.ConceptSetFilterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet.ConceptSetFilterComponent tgt = new org.hl7.fhir.r5.model.ValueSet.ConceptSetFilterComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasPropertyElement())
            tgt.setPropertyElement((org.hl7.fhir.r5.model.CodeType) VersionConvertor_10_50.convertType(src.getPropertyElement()));
        if (src.hasOp()) {
            tgt.setOp(convertFilterOperator(src.getOp()));
        }
        if (src.hasValueElement())
            tgt.setValueElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getValueElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.FilterOperator convertFilterOperator(org.hl7.fhir.r5.model.Enumerations.FilterOperator src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case EQUAL:
                return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.EQUAL;
            case ISA:
                return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.ISA;
            case ISNOTA:
                return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.ISNOTA;
            case REGEX:
                return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.REGEX;
            case IN:
                return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.IN;
            case NOTIN:
                return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.NOTIN;
            default:
                return org.hl7.fhir.dstu2.model.ValueSet.FilterOperator.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.Enumerations.FilterOperator convertFilterOperator(org.hl7.fhir.dstu2.model.ValueSet.FilterOperator src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case EQUAL:
                return org.hl7.fhir.r5.model.Enumerations.FilterOperator.EQUAL;
            case ISA:
                return org.hl7.fhir.r5.model.Enumerations.FilterOperator.ISA;
            case ISNOTA:
                return org.hl7.fhir.r5.model.Enumerations.FilterOperator.ISNOTA;
            case REGEX:
                return org.hl7.fhir.r5.model.Enumerations.FilterOperator.REGEX;
            case IN:
                return org.hl7.fhir.r5.model.Enumerations.FilterOperator.IN;
            case NOTIN:
                return org.hl7.fhir.r5.model.Enumerations.FilterOperator.NOTIN;
            default:
                return org.hl7.fhir.r5.model.Enumerations.FilterOperator.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.ValueSet convertValueSet(org.hl7.fhir.r5.model.ValueSet src, VersionConvertorAdvisor50 advisor) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet tgt = new org.hl7.fhir.dstu2.model.ValueSet();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasUrlElement()) tgt.setUrlElement((UriType) VersionConvertor_10_50.convertType(src.getUrlElement()));
        for (org.hl7.fhir.r5.model.Identifier i : src.getIdentifier()) tgt.setIdentifier(VersionConvertor_10_50.convertIdentifier(i));
        if (src.hasVersion()) tgt.setVersionElement((StringType) VersionConvertor_10_50.convertType(src.getVersionElement()));
        if (src.hasNameElement()) tgt.setNameElement((StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasStatus()) tgt.setStatus(VersionConvertor_10_50.convertConformanceResourceStatus(src.getStatus()));
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.dstu2.model.BooleanType) VersionConvertor_10_50.convertType(src.getExperimentalElement()));
        if (src.hasPublisherElement()) tgt.setPublisherElement((StringType) VersionConvertor_10_50.convertType(src.getPublisherElement()));
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getContact()) tgt.addContact(convertValueSetContactComponent(t));
        if (src.hasDateElement())
            tgt.setDateElement((org.hl7.fhir.dstu2.model.DateTimeType) VersionConvertor_10_50.convertType(src.getDateElement()));
        if (src.getCompose().hasLockedDateElement()) tgt.setLockedDateElement((DateType) VersionConvertor_10_50.convertType(src.getCompose().getLockedDateElement()));
        if (src.hasDescriptionElement()) tgt.setDescriptionElement((StringType) VersionConvertor_10_50.convertType(src.getDescriptionElement()));
        for (org.hl7.fhir.r5.model.UsageContext t : src.getUseContext()) if (t.hasValueCodeableConcept())
            tgt.addUseContext(VersionConvertor_10_50.convertCodeableConcept(t.getValueCodeableConcept()));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getJurisdiction()) tgt.addUseContext(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasImmutableElement()) tgt.setImmutableElement((org.hl7.fhir.dstu2.model.BooleanType) VersionConvertor_10_50.convertType(src.getImmutableElement()));
        if (src.hasPurposeElement()) tgt.setRequirementsElement((StringType) VersionConvertor_10_50.convertType(src.getPurposeElement()));
        if (src.hasCopyright()) tgt.setCopyright(src.getCopyright());
        if (src.hasExtension("http://hl7.org/fhir/StructureDefinition/valueset-extensible"))
            tgt.setExtensible(((BooleanType) src.getExtensionByUrl("http://hl7.org/fhir/StructureDefinition/valueset-extensible").getValue()).booleanValue());
        org.hl7.fhir.r5.model.CodeSystem srcCS = (CodeSystem) src.getUserData("r2-cs");
        if (srcCS == null && advisor != null)
            srcCS = advisor.getCodeSystem(src);
        if (srcCS != null) {
            tgt.getCodeSystem().setSystem(srcCS.getUrl());
            tgt.getCodeSystem().setVersion(srcCS.getVersion());
            tgt.getCodeSystem().setCaseSensitive(srcCS.getCaseSensitive());
            for (org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionComponent cs : srcCS.getConcept()) processConcept(tgt.getCodeSystem().getConcept(), cs, srcCS);
        }
        if (src.hasCompose()) tgt.setCompose(convertValueSetComposeComponent(src.getCompose(), srcCS == null ? null : srcCS.getUrl()));
        if (src.hasExpansion()) tgt.setExpansion(convertValueSetExpansionComponent(src.getExpansion()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ValueSet convertValueSet(org.hl7.fhir.dstu2.model.ValueSet src) throws FHIRException {
        return convertValueSet(src, null);
    }

    public static org.hl7.fhir.r5.model.ValueSet convertValueSet(org.hl7.fhir.dstu2.model.ValueSet src, VersionConvertorAdvisor50 advisor) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet tgt = new org.hl7.fhir.r5.model.ValueSet();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_10_50.convertType(src.getUrlElement()));
        if (src.hasIdentifier()) {
            tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(src.getIdentifier()));
        }
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getVersionElement()));
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasStatus()) {
            tgt.setStatus(VersionConvertor_10_50.convertConformanceResourceStatus(src.getStatus()));
        }
        if (src.hasExperimentalElement())
            tgt.setExperimentalElement((org.hl7.fhir.r5.model.BooleanType) VersionConvertor_10_50.convertType(src.getExperimentalElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getPublisherElement()));
        if (src.hasContact()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent t : src.getContact()) tgt.addContact(convertValueSetContactComponent(t));
        }
        if (src.hasDateElement())
            tgt.setDateElement((org.hl7.fhir.r5.model.DateTimeType) VersionConvertor_10_50.convertType(src.getDateElement()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext()) if (VersionConvertor_10_50.isJurisdiction(t))
            tgt.addJurisdiction(VersionConvertor_10_50.convertCodeableConcept(t));
        else
            tgt.addUseContext(VersionConvertor_10_50.convertCodeableConceptToUsageContext(t));
        if (src.hasImmutableElement())
            tgt.setImmutableElement((org.hl7.fhir.r5.model.BooleanType) VersionConvertor_10_50.convertType(src.getImmutableElement()));
        if (src.hasRequirements()) {
            tgt.setPurpose(src.getRequirements());
        }
        if (src.hasCopyright())
            tgt.setCopyright(src.getCopyright());
        if (src.hasExtensible())
            tgt.addExtension("http://hl7.org/fhir/StructureDefinition/valueset-extensible", new BooleanType(src.getExtensible()));
        if (src.hasCompose()) {
            if (src.hasCompose()) {
                tgt.setCompose(convertValueSetComposeComponent(src.getCompose()));
            }
            if (src.hasLockedDate()) {
                tgt.getCompose().setLockedDate(src.getLockedDate());
            }
        }
        if (src.hasCodeSystem() && advisor != null) {
            org.hl7.fhir.r5.model.CodeSystem tgtcs = new org.hl7.fhir.r5.model.CodeSystem();
            VersionConvertor_10_50.copyDomainResource(src, tgtcs);
            if (src.hasCodeSystem()) {
                tgtcs.setUrl(src.getCodeSystem().getSystem());
            }
            if (src.hasIdentifier()) {
                tgtcs.addIdentifier(VersionConvertor_10_50.convertIdentifier(src.getIdentifier()));
            }
            if (src.hasCodeSystem()) {
                tgtcs.setVersion(src.getCodeSystem().getVersion());
            }
            if (src.hasName()) {
                tgtcs.setName(src.getName() + " Code System");
            }
            if (src.hasStatus()) {
                tgtcs.setStatus(VersionConvertor_10_50.convertConformanceResourceStatus(src.getStatus()));
            }
            if (src.hasExperimentalElement())
                tgtcs.setExperimentalElement((BooleanType) VersionConvertor_10_50.convertType(src.getExperimentalElement()));
            if (src.hasPublisherElement()) {
                tgtcs.setPublisherElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getPublisherElement()));
            }
            if (src.hasContact()) {
                for (org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent t : src.getContact()) tgtcs.addContact(convertValueSetContactComponent(t));
            }
            if (src.hasDateElement())
                tgtcs.setDateElement((DateTimeType) VersionConvertor_10_50.convertType(src.getDateElement()));
            if (src.hasDescription()) {
                tgtcs.setDescription(src.getDescription());
            }
            for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext()) if (VersionConvertor_10_50.isJurisdiction(t))
                tgtcs.addJurisdiction(VersionConvertor_10_50.convertCodeableConcept(t));
            else
                tgtcs.addUseContext(VersionConvertor_10_50.convertCodeableConceptToUsageContext(t));
            if (src.hasRequirements()) {
                tgtcs.setPurpose(src.getRequirements());
            }
            if (src.hasCopyright()) {
                tgtcs.setCopyright(src.getCopyright());
            }
            tgtcs.setContent(CodeSystemContentMode.COMPLETE);
            if (src.hasCodeSystem()) {
                tgtcs.setCaseSensitive(src.getCodeSystem().getCaseSensitive());
            }
            if (src.hasCodeSystem()) {
                for (org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionComponent cs : src.getCodeSystem().getConcept()) processConcept(tgtcs.getConcept(), cs, tgtcs);
            }
            advisor.handleCodeSystem(tgtcs, tgt);
            tgt.setUserData("r2-cs", tgtcs);
            tgt.getCompose().addInclude().setSystem(tgtcs.getUrl());
        }
        if (src.hasExpansion()) {
            tgt.setExpansion(convertValueSetExpansionComponent(src.getExpansion()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet convertValueSet(org.hl7.fhir.r5.model.ValueSet src) throws FHIRException {
        return convertValueSet(src, null);
    }

    public static org.hl7.fhir.r5.model.ValueSet.ValueSetComposeComponent convertValueSetComposeComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetComposeComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet.ValueSetComposeComponent tgt = new org.hl7.fhir.r5.model.ValueSet.ValueSetComposeComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasImport()) {
            for (org.hl7.fhir.dstu2.model.UriType t : src.getImport()) tgt.addInclude().addValueSet(t.getValue());
        }
        if (src.hasInclude()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent t : src.getInclude()) tgt.addInclude(convertConceptSetComponent(t));
        }
        if (src.hasExclude()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ConceptSetComponent t : src.getExclude()) tgt.addExclude(convertConceptSetComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetComposeComponent convertValueSetComposeComponent(org.hl7.fhir.r5.model.ValueSet.ValueSetComposeComponent src, String noSystem) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ValueSetComposeComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetComposeComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        for (org.hl7.fhir.r5.model.ValueSet.ConceptSetComponent t : src.getInclude()) {
            for (org.hl7.fhir.r5.model.UriType ti : t.getValueSet()) tgt.addImport(ti.getValue());
            if (noSystem == null || !t.getSystem().equals(noSystem))
                tgt.addInclude(convertConceptSetComponent(t));
        }
        if (src.hasExclude()) {
            for (org.hl7.fhir.r5.model.ValueSet.ConceptSetComponent t : src.getExclude()) tgt.addExclude(convertConceptSetComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ContactDetail convertValueSetContactComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ContactDetail tgt = new org.hl7.fhir.r5.model.ContactDetail();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_10_50.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent convertValueSetContactComponent(org.hl7.fhir.r5.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetContactComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasTelecom()) {
            for (org.hl7.fhir.r5.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_10_50.convertContactPoint(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionComponent convertValueSetExpansionComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionComponent tgt = new org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasIdentifierElement())
            tgt.setIdentifierElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_10_50.convertType(src.getIdentifierElement()));
        if (src.hasTimestampElement())
            tgt.setTimestampElement((org.hl7.fhir.r5.model.DateTimeType) VersionConvertor_10_50.convertType(src.getTimestampElement()));
        if (src.hasTotalElement())
            tgt.setTotalElement((org.hl7.fhir.r5.model.IntegerType) VersionConvertor_10_50.convertType(src.getTotalElement()));
        if (src.hasOffsetElement())
            tgt.setOffsetElement((org.hl7.fhir.r5.model.IntegerType) VersionConvertor_10_50.convertType(src.getOffsetElement()));
        if (src.hasParameter()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent t : src.getParameter()) tgt.addParameter(convertValueSetExpansionParameterComponent(t));
        }
        if (src.hasContains()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains()) tgt.addContains(convertValueSetExpansionContainsComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionComponent convertValueSetExpansionComponent(org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasIdentifierElement())
            tgt.setIdentifierElement((org.hl7.fhir.dstu2.model.UriType) VersionConvertor_10_50.convertType(src.getIdentifierElement()));
        if (src.hasTimestampElement())
            tgt.setTimestampElement((org.hl7.fhir.dstu2.model.DateTimeType) VersionConvertor_10_50.convertType(src.getTimestampElement()));
        if (src.hasTotalElement())
            tgt.setTotalElement((org.hl7.fhir.dstu2.model.IntegerType) VersionConvertor_10_50.convertType(src.getTotalElement()));
        if (src.hasOffsetElement())
            tgt.setOffsetElement((org.hl7.fhir.dstu2.model.IntegerType) VersionConvertor_10_50.convertType(src.getOffsetElement()));
        if (src.hasParameter()) {
            for (org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionParameterComponent t : src.getParameter()) tgt.addParameter(convertValueSetExpansionParameterComponent(t));
        }
        if (src.hasContains()) {
            for (org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains()) tgt.addContains(convertValueSetExpansionContainsComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent convertValueSetExpansionContainsComponent(org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionContainsComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasSystemElement())
            tgt.setSystemElement((org.hl7.fhir.dstu2.model.UriType) VersionConvertor_10_50.convertType(src.getSystemElement()));
        if (src.hasAbstractElement())
            tgt.setAbstractElement((org.hl7.fhir.dstu2.model.BooleanType) VersionConvertor_10_50.convertType(src.getAbstractElement()));
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getVersionElement()));
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.dstu2.model.CodeType) VersionConvertor_10_50.convertType(src.getCodeElement()));
        if (src.hasDisplayElement())
            tgt.setDisplayElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getDisplayElement()));
        if (src.hasContains()) {
            for (org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains()) tgt.addContains(convertValueSetExpansionContainsComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionContainsComponent convertValueSetExpansionContainsComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionContainsComponent tgt = new org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionContainsComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasSystemElement())
            tgt.setSystemElement((org.hl7.fhir.r5.model.UriType) VersionConvertor_10_50.convertType(src.getSystemElement()));
        if (src.hasAbstractElement())
            tgt.setAbstractElement((org.hl7.fhir.r5.model.BooleanType) VersionConvertor_10_50.convertType(src.getAbstractElement()));
        if (src.hasVersionElement())
            tgt.setVersionElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getVersionElement()));
        if (src.hasCodeElement())
            tgt.setCodeElement((org.hl7.fhir.r5.model.CodeType) VersionConvertor_10_50.convertType(src.getCodeElement()));
        if (src.hasDisplayElement())
            tgt.setDisplayElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getDisplayElement()));
        if (src.hasContains()) {
            for (org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionContainsComponent t : src.getContains()) tgt.addContains(convertValueSetExpansionContainsComponent(t));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent convertValueSetExpansionParameterComponent(org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionParameterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent tgt = new org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.dstu2.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasValue()) {
            tgt.setValue(VersionConvertor_10_50.convertType(src.getValue()));
        }
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionParameterComponent convertValueSetExpansionParameterComponent(org.hl7.fhir.dstu2.model.ValueSet.ValueSetExpansionParameterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionParameterComponent tgt = new org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionParameterComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement((org.hl7.fhir.r5.model.StringType) VersionConvertor_10_50.convertType(src.getNameElement()));
        if (src.hasValue()) {
            tgt.setValue(VersionConvertor_10_50.convertType(src.getValue()));
        }
        return tgt;
    }

    static public void processConcept(List<org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionComponent> concepts, ConceptDefinitionComponent cs, CodeSystem srcCS) throws FHIRException {
        org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionComponent ct = new org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionComponent();
        concepts.add(ct);
        ct.setCode(cs.getCode());
        ct.setDisplay(cs.getDisplay());
        ct.setDefinition(cs.getDefinition());
        if (CodeSystemUtilities.isNotSelectable(srcCS, cs))
            ct.setAbstract(true);
        for (org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionDesignationComponent csd : cs.getDesignation()) {
            org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionDesignationComponent cst = new org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionDesignationComponent();
            cst.setLanguage(csd.getLanguage());
            cst.setUse(VersionConvertor_10_50.convertCoding(csd.getUse()));
            cst.setValue(csd.getValue());
        }
        for (ConceptDefinitionComponent csc : cs.getConcept()) processConcept(ct.getConcept(), csc, srcCS);
    }

    static public void processConcept(List<ConceptDefinitionComponent> concepts, org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionComponent cs, CodeSystem tgtcs) throws FHIRException {
        org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionComponent ct = new org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionComponent();
        concepts.add(ct);
        ct.setCode(cs.getCode());
        ct.setDisplay(cs.getDisplay());
        ct.setDefinition(cs.getDefinition());
        if (cs.getAbstract())
            CodeSystemUtilities.setNotSelectable(tgtcs, ct);
        for (org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionDesignationComponent csd : cs.getDesignation()) {
            org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionDesignationComponent cst = new org.hl7.fhir.r5.model.CodeSystem.ConceptDefinitionDesignationComponent();
            cst.setLanguage(csd.getLanguage());
            cst.setUse(VersionConvertor_10_50.convertCoding(csd.getUse()));
            cst.setValue(csd.getValue());
        }
        for (org.hl7.fhir.dstu2.model.ValueSet.ConceptDefinitionComponent csc : cs.getConcept()) processConcept(ct.getConcept(), csc, tgtcs);
    }
}
