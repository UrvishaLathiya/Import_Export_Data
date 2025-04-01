package com.example.Import_Export_Data.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "master_chart_of_account", schema = "master")
public class MasterChartOfAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String chartofaccountname;
    private String description;
    private String p_version;
    private Integer prev_chart_of_account_id;
    private Integer industry_id;
    private Boolean is_deleted;
    private Boolean is_default;
//    private Time created_date;
    private Integer created_by;
//    private Time updated_date;
    private Integer updated_by;
    private Boolean is_active;
    private Integer status_id;
    private Boolean is_versioning;
    private Boolean is_copy_chartofaccount;

    public MasterChartOfAccount() {
    }

    public MasterChartOfAccount(Integer id, String chartofaccountname, String description, String p_version, Integer prev_chart_of_account_id, Integer industry_id, Boolean is_deleted, Boolean is_default, Timestamp created_date, Integer created_by, Timestamp updated_date, Integer updated_by, Boolean is_active, Integer status_id, Boolean is_versioning, Boolean is_copy_chartofaccount, Integer country_id, Boolean is_substantial_change) {
        this.id = id;
        this.chartofaccountname = chartofaccountname;
        this.description = description;
        this.p_version = p_version;
        this.prev_chart_of_account_id = prev_chart_of_account_id;
        this.industry_id = industry_id;
        this.is_deleted = is_deleted;
        this.is_default = is_default;
//        this.created_date = created_date;
        this.created_by = created_by;
//        this.updated_date = updated_date;
        this.updated_by = updated_by;
        this.is_active = is_active;
        this.status_id = status_id;
        this.is_versioning = is_versioning;
        this.is_copy_chartofaccount = is_copy_chartofaccount;
        this.country_id = country_id;
        this.is_substantial_change = is_substantial_change;
    }

    @Column(columnDefinition = "int4 DEFAULT 101")
    private Integer country_id = 101;

    @Column(columnDefinition = "boolean DEFAULT false")
    private Boolean is_substantial_change = false;

    //getter setter
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getChartofaccountname() { return chartofaccountname; }
    public void setChartofaccountname(String chartofaccountname) { this.chartofaccountname = chartofaccountname; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getP_version() { return p_version; }
    public void setP_version(String p_version) { this.p_version = p_version; }

    public Integer getPrev_chart_of_account_id() { return prev_chart_of_account_id; }
    public void setPrev_chart_of_account_id(Integer prev_chart_of_account_id) { this.prev_chart_of_account_id = prev_chart_of_account_id; }

    public Integer getIndustry_id() { return industry_id; }
    public void setIndustry_id(Integer industry_id) { this.industry_id = industry_id; }

    public Boolean getIs_deleted() { return is_deleted; }
    public void setIs_deleted(Boolean is_deleted) { this.is_deleted = is_deleted; }

    public Boolean getIs_default() { return is_default; }
    public void setIs_default(Boolean is_default) { this.is_default = is_default; }

//    public Timestamp getCreated_date() { return created_date; }
//    public void setCreated_date(Timestamp created_date) { this.created_date = created_date; }

    public Integer getCreated_by() { return created_by; }
    public void setCreated_by(Integer created_by) { this.created_by = created_by; }

//    public Timestamp getUpdated_date() { return updated_date; }
//    public void setUpdated_date(Timestamp updated_date) { this.updated_date = updated_date; }

    public Integer getUpdated_by() { return updated_by; }
    public void setUpdated_by(Integer updated_by) { this.updated_by = updated_by; }

    public Boolean getIs_active() { return is_active; }
    public void setIs_active(Boolean is_active) { this.is_active = is_active; }

    public Integer getStatus_id() { return status_id; }
    public void setStatus_id(Integer status_id) { this.status_id = status_id; }

    public Boolean getIs_versioning() { return is_versioning; }
    public void setIs_versioning(Boolean is_versioning) { this.is_versioning = is_versioning; }

    public Boolean getIs_copy_chartofaccount() { return is_copy_chartofaccount; }
    public void setIs_copy_chartofaccount(Boolean is_copy_chartofaccount) { this.is_copy_chartofaccount = is_copy_chartofaccount; }

    public Integer getCountry_id() { return country_id; }
    public void setCountry_id(Integer country_id) { this.country_id = country_id; }

    public Boolean getIs_substantial_change() { return is_substantial_change; }
    public void setIs_substantial_change(Boolean is_substantial_change) { this.is_substantial_change = is_substantial_change; }

}
