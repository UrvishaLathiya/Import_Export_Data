package com.example.Import_Export_Data.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "account_production_master_sections", schema = "master")
public class AccountProductionMasterSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "parentid")
    private Integer parentId;

    @Column(name = "serialnumber")
    private Integer serialNumber;

    @Column(name = "menutype")
    private Integer menuType;

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
    private Integer apVersion;   // This will map to master_chart_of_account.id in destination

    @Column(name = "alias_name")
    private String aliasName;

    @Column(name = "original_section_id")
    private Integer originalSectionId;

    public AccountProductionMasterSection() {
    }

    public AccountProductionMasterSection(Integer id, String menuName, Integer parentId, Integer serialNumber, Integer menuType, Boolean isEditable, Boolean isActive, Boolean isDeleted, Integer createdBy, LocalDateTime createdDate, Integer updatedBy, LocalDateTime updatedDate, Integer apVersion, String aliasName, Integer originalSectionId) {
        this.id = id;
        this.menuName = menuName;
        this.parentId = parentId;
        this.serialNumber = serialNumber;
        this.menuType = menuType;
        this.isEditable = isEditable;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
        this.createdBy = createdBy;
//        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
//        this.updatedDate = updatedDate;
        this.apVersion = apVersion;
        this.aliasName = aliasName;
        this.originalSectionId = originalSectionId;
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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
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

//    public LocalDateTime getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(LocalDateTime createdDate) {
//        this.createdDate = createdDate;
//    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

//    public LocalDateTime getUpdatedDate() {
//        return updatedDate;
//    }
//
//    public void setUpdatedDate(LocalDateTime updatedDate) {
//        this.updatedDate = updatedDate;
//    }

    public Integer getApVersion() {
        return apVersion;
    }

    public void setApVersion(Integer apVersion) {
        this.apVersion = apVersion;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public Integer getOriginalSectionId() {
        return originalSectionId;
    }

    public void setOriginalSectionId(Integer originalSectionId) {
        this.originalSectionId = originalSectionId;
    }
}
