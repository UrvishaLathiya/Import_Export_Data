package com.example.Import_Export_Data.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "account_production_master_tables", schema = "master")
public class AccountProductionMasterTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "master_section_id")
    private Integer masterSectionId;

    @Column(name = "sub_section_id")
    private Integer subSectionId;

    @Column(name = "master_chart_of_account_id")
    private Integer masterChartOfAccountId;


    @Column(name = "table_json", columnDefinition = "TEXT")
    private String tableJson;

    @Column(name = "reference_id")
    private Integer referenceId;

    @Column(name = "is_editable")
    private Boolean isEditable;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "created_by")
    private Integer createdBy;

//    @Column(name = "created_date")
//    private LocalDateTime createdDate;

    @Column(name = "updated_by")
    private Integer updatedBy;

//    @Column(name = "updated_date")
//    private LocalDateTime updatedDate;

    @Column(name = "ap_version")
    private Integer apVersion;

    @Column(name = "header_type")
    private Integer headerType;

    @Column(name = "checklist_question_reference")
    private String checklistQuestionReference;

    @Column(name = "sequence_number")
    private Integer sequenceNumber;

    @Column(name = "fsa_area_id")
    private Integer fsaAreaId;

    @Column(name = "original_table_id")
    private Integer originalTableId;

    @Column(name = "isckeditorcheck")
    private Boolean isCkeditorCheck;

    public AccountProductionMasterTable() {
    }

    public AccountProductionMasterTable(Integer id, String menuName, Integer masterSectionId, Integer subSectionId, Integer masterChartOfAccountId, String tableJson, Integer referenceId, Boolean isEditable, Boolean isActive, Boolean isDeleted, Integer createdBy, Integer updatedBy, Integer apVersion, Integer headerType, String checklistQuestionReference, Integer sequenceNumber, Integer fsaAreaId, Integer originalTableId, Boolean isCkeditorCheck) {
        this.id = id;
        this.menuName = menuName;
        this.masterSectionId = masterSectionId;
        this.subSectionId = subSectionId;
        this.masterChartOfAccountId = masterChartOfAccountId;
        this.tableJson = tableJson;
        this.referenceId = referenceId;
        this.isEditable = isEditable;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.apVersion = apVersion;
        this.headerType = headerType;
        this.checklistQuestionReference = checklistQuestionReference;
        this.sequenceNumber = sequenceNumber;
        this.fsaAreaId = fsaAreaId;
        this.originalTableId = originalTableId;
        this.isCkeditorCheck = isCkeditorCheck;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMasterSectionId() {
        return masterSectionId;
    }

    public void setMasterSectionId(Integer masterSectionId) {
        this.masterSectionId = masterSectionId;
    }

    public Integer getSubSectionId() {
        return subSectionId;
    }

    public void setSubSectionId(Integer subSectionId) {
        this.subSectionId = subSectionId;
    }

    public Integer getMasterChartOfAccountId() {
        return masterChartOfAccountId;
    }

    public void setMasterChartOfAccountId(Integer masterChartOfAccountId) {
        this.masterChartOfAccountId = masterChartOfAccountId;
    }

    public String getTableJson() {
        return tableJson;
    }

    public void setTableJson(String tableJson) {
        this.tableJson = tableJson;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public Boolean getEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getApVersion() {
        return apVersion;
    }

    public void setApVersion(Integer apVersion) {
        this.apVersion = apVersion;
    }

    public Integer getHeaderType() {
        return headerType;
    }

    public void setHeaderType(Integer headerType) {
        this.headerType = headerType;
    }

    public String getChecklistQuestionReference() {
        return checklistQuestionReference;
    }

    public void setChecklistQuestionReference(String checklistQuestionReference) {
        this.checklistQuestionReference = checklistQuestionReference;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getFsaAreaId() {
        return fsaAreaId;
    }

    public void setFsaAreaId(Integer fsaAreaId) {
        this.fsaAreaId = fsaAreaId;
    }

    public Integer getOriginalTableId() {
        return originalTableId;
    }

    public void setOriginalTableId(Integer originalTableId) {
        this.originalTableId = originalTableId;
    }

    public Boolean getCkeditorCheck() {
        return isCkeditorCheck;
    }

    public void setCkeditorCheck(Boolean ckeditorCheck) {
        isCkeditorCheck = ckeditorCheck;
    }
}
