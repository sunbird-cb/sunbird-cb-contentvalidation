package org.sunbird.contentvalidation.model.contentsearch.sunbirdresp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Child {
    private List<String> ownershipType;
    private String parent;
    private String code;
    private Credentials credentials;
    private String channel;
    private String downloadUrl;
    private List<String> organisation;
    private String description;
    private List<String> language;
    private String mimeType;
    private String idealScreenSize;
    private Date createdOn;
    private String objectType;
    private String duration;
    private String primaryCategory;
    private String contentDisposition;
    private Date lastUpdatedOn;
    private String contentEncoding;
    private String artifactUrl;
    private String contentType;
    private String dialcodeRequired;
    private Trackable trackable;
    private String identifier;
    private Date lastStatusChangedOn;
    private List<String> createdFor;
    private List<String> audience;
    private String creator;
    private List<String> os;
    private boolean isExternal;
    private String visibility;
    private String cloudStorageKey;
    private int index;
    private String mediaType;
    private String osId;
    private List<String> languageCode;
    private int version;
    private String versionKey;
    private String license;
    private String idealScreenDensity;
    private String framework;
    private int depth;
    private String s3Key;
    private int size;
    private String createdBy;
    private int compatibilityLevel;
    private String name;
    private String status;
    private List<Child> children;

    public List<String> getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(List<String> ownershipType) {
        this.ownershipType = ownershipType;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public List<String> getOrganisation() {
        return organisation;
    }

    public void setOrganisation(List<String> organisation) {
        this.organisation = organisation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getIdealScreenSize() {
        return idealScreenSize;
    }

    public void setIdealScreenSize(String idealScreenSize) {
        this.idealScreenSize = idealScreenSize;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrimaryCategory() {
        return primaryCategory;
    }

    public void setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public String getArtifactUrl() {
        return artifactUrl;
    }

    public void setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDialcodeRequired() {
        return dialcodeRequired;
    }

    public void setDialcodeRequired(String dialcodeRequired) {
        this.dialcodeRequired = dialcodeRequired;
    }

    public Trackable getTrackable() {
        return trackable;
    }

    public void setTrackable(Trackable trackable) {
        this.trackable = trackable;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getLastStatusChangedOn() {
        return lastStatusChangedOn;
    }

    public void setLastStatusChangedOn(Date lastStatusChangedOn) {
        this.lastStatusChangedOn = lastStatusChangedOn;
    }

    public List<String> getCreatedFor() {
        return createdFor;
    }

    public void setCreatedFor(List<String> createdFor) {
        this.createdFor = createdFor;
    }

    public List<String> getAudience() {
        return audience;
    }

    public void setAudience(List<String> audience) {
        this.audience = audience;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public List<String> getOs() {
        return os;
    }

    public void setOs(List<String> os) {
        this.os = os;
    }

    public boolean isExternal() {
        return isExternal;
    }

    public void setExternal(boolean external) {
        isExternal = external;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getCloudStorageKey() {
        return cloudStorageKey;
    }

    public void setCloudStorageKey(String cloudStorageKey) {
        this.cloudStorageKey = cloudStorageKey;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getOsId() {
        return osId;
    }

    public void setOsId(String osId) {
        this.osId = osId;
    }

    public List<String> getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(List<String> languageCode) {
        this.languageCode = languageCode;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getVersionKey() {
        return versionKey;
    }

    public void setVersionKey(String versionKey) {
        this.versionKey = versionKey;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getIdealScreenDensity() {
        return idealScreenDensity;
    }

    public void setIdealScreenDensity(String idealScreenDensity) {
        this.idealScreenDensity = idealScreenDensity;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getS3Key() {
        return s3Key;
    }

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getCompatibilityLevel() {
        return compatibilityLevel;
    }

    public void setCompatibilityLevel(int compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getCreatorContacts() {
        return creatorContacts;
    }

    public void setCreatorContacts(String creatorContacts) {
        this.creatorContacts = creatorContacts;
    }

    private String creatorContacts;
}
