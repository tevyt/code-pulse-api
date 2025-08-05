package com.tevyt.code_pulse_api.github.api.getRepositories;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.net.URI;
import java.util.*;

public class Repository {

    /**
     * Unique identifier of the repository
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique identifier of the repository")
    private Integer id;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("node_id")
    private String nodeId;
    /**
     * The name of the repository.
     * (Required)
     *
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the repository.")
    private String name;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("full_name")
    private String fullName;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("license")
    private Object license;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks")
    private Integer forks;
    @JsonProperty("permissions")
    private Permissions permissions;
    /**
     * Simple User
     * <p>
     * A GitHub user.
     * (Required)
     *
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("A GitHub user.")
    private Owner owner;
    /**
     * Whether the repository is private or public.
     * (Required)
     *
     */
    @JsonProperty("private")
    @JsonPropertyDescription("Whether the repository is private or public.")
    private Boolean _private = false;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("html_url")
    private URI htmlUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("description")
    private String description;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fork")
    private Boolean fork;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("url")
    private URI url;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("archive_url")
    private String archiveUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("assignees_url")
    private String assigneesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("blobs_url")
    private String blobsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("branches_url")
    private String branchesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("collaborators_url")
    private String collaboratorsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("comments_url")
    private String commentsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("commits_url")
    private String commitsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("compare_url")
    private String compareUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("contents_url")
    private String contentsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("contributors_url")
    private URI contributorsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("deployments_url")
    private URI deploymentsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("downloads_url")
    private URI downloadsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("events_url")
    private URI eventsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks_url")
    private URI forksUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_commits_url")
    private String gitCommitsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_refs_url")
    private String gitRefsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_tags_url")
    private String gitTagsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_url")
    private String gitUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issue_comment_url")
    private String issueCommentUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issue_events_url")
    private String issueEventsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issues_url")
    private String issuesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("keys_url")
    private String keysUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("labels_url")
    private String labelsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("languages_url")
    private URI languagesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("merges_url")
    private URI mergesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("milestones_url")
    private String milestonesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pulls_url")
    private String pullsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("releases_url")
    private String releasesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ssh_url")
    private String sshUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stargazers_url")
    private URI stargazersUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("statuses_url")
    private String statusesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("subscribers_url")
    private URI subscribersUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("subscription_url")
    private URI subscriptionUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tags_url")
    private URI tagsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("teams_url")
    private URI teamsUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("trees_url")
    private String treesUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("clone_url")
    private String cloneUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("mirror_url")
    private URI mirrorUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("hooks_url")
    private URI hooksUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("svn_url")
    private URI svnUrl;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("homepage")
    private URI homepage;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("language")
    private String language;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks_count")
    private Integer forksCount;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stargazers_count")
    private Integer stargazersCount;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("watchers_count")
    private Integer watchersCount;
    /**
     * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.
     * (Required)
     *
     */
    @JsonProperty("size")
    @JsonPropertyDescription("The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.")
    private Integer size;
    /**
     * The default branch of the repository.
     * (Required)
     *
     */
    @JsonProperty("default_branch")
    @JsonPropertyDescription("The default branch of the repository.")
    private String defaultBranch;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;
    /**
     * Whether this repository acts as a template that can be used to generate new repositories.
     *
     */
    @JsonProperty("is_template")
    @JsonPropertyDescription("Whether this repository acts as a template that can be used to generate new repositories.")
    private Boolean isTemplate = false;
    @JsonProperty("topics")
    private List<String> topics;
    /**
     * Whether issues are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_issues")
    @JsonPropertyDescription("Whether issues are enabled.")
    private Boolean hasIssues = true;
    /**
     * Whether projects are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_projects")
    @JsonPropertyDescription("Whether projects are enabled.")
    private Boolean hasProjects = true;
    /**
     * Whether the wiki is enabled.
     * (Required)
     *
     */
    @JsonProperty("has_wiki")
    @JsonPropertyDescription("Whether the wiki is enabled.")
    private Boolean hasWiki = true;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("has_pages")
    private Boolean hasPages;
    /**
     * Whether downloads are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_downloads")
    @JsonPropertyDescription("Whether downloads are enabled.")
    private Boolean hasDownloads = true;
    /**
     * Whether discussions are enabled.
     *
     */
    @JsonProperty("has_discussions")
    @JsonPropertyDescription("Whether discussions are enabled.")
    private Boolean hasDiscussions = false;
    /**
     * Whether the repository is archived.
     * (Required)
     *
     */
    @JsonProperty("archived")
    @JsonPropertyDescription("Whether the repository is archived.")
    private Boolean archived = false;
    /**
     * Returns whether or not this repository disabled.
     * (Required)
     *
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("Returns whether or not this repository disabled.")
    private Boolean disabled;
    /**
     * The repository visibility: public, private, or internal.
     *
     */
    @JsonProperty("visibility")
    @JsonPropertyDescription("The repository visibility: public, private, or internal.")
    private String visibility = "public";
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pushed_at")
    private Date pushedAt;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("created_at")
    private Date createdAt;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("updated_at")
    private Date updatedAt;
    /**
     * Whether to allow rebase merges for pull requests.
     *
     */
    @JsonProperty("allow_rebase_merge")
    @JsonPropertyDescription("Whether to allow rebase merges for pull requests.")
    private Boolean allowRebaseMerge = true;
    @JsonProperty("temp_clone_token")
    private String tempCloneToken;
    /**
     * Whether to allow squash merges for pull requests.
     *
     */
    @JsonProperty("allow_squash_merge")
    @JsonPropertyDescription("Whether to allow squash merges for pull requests.")
    private Boolean allowSquashMerge = true;
    /**
     * Whether to allow Auto-merge to be used on pull requests.
     *
     */
    @JsonProperty("allow_auto_merge")
    @JsonPropertyDescription("Whether to allow Auto-merge to be used on pull requests.")
    private Boolean allowAutoMerge = false;
    /**
     * Whether to delete head branches when pull requests are merged
     *
     */
    @JsonProperty("delete_branch_on_merge")
    @JsonPropertyDescription("Whether to delete head branches when pull requests are merged")
    private Boolean deleteBranchOnMerge = false;
    /**
     * Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.
     *
     */
    @JsonProperty("allow_update_branch")
    @JsonPropertyDescription("Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.")
    private Boolean allowUpdateBranch = false;
    /**
     * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.
     *
     */
    @JsonProperty("use_squash_pr_title_as_default")
    @JsonPropertyDescription("Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.")
    private Boolean useSquashPrTitleAsDefault = false;
    /**
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     *
     */
    @JsonProperty("squash_merge_commit_title")
    @JsonPropertyDescription("The default value for a squash merge commit title:\n\n- `PR_TITLE` - default to the pull request's title.\n- `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).")
    private Repository.SquashMergeCommitTitle squashMergeCommitTitle;
    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     *
     */
    @JsonProperty("squash_merge_commit_message")
    @JsonPropertyDescription("The default value for a squash merge commit message:\n\n- `PR_BODY` - default to the pull request's body.\n- `COMMIT_MESSAGES` - default to the branch's commit messages.\n- `BLANK` - default to a blank commit message.")
    private Repository.SquashMergeCommitMessage squashMergeCommitMessage;
    /**
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     *
     */
    @JsonProperty("merge_commit_title")
    @JsonPropertyDescription("The default value for a merge commit title.\n\n- `PR_TITLE` - default to the pull request's title.\n- `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).")
    private Repository.MergeCommitTitle mergeCommitTitle;
    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     *
     */
    @JsonProperty("merge_commit_message")
    @JsonPropertyDescription("The default value for a merge commit message.\n\n- `PR_TITLE` - default to the pull request's title.\n- `PR_BODY` - default to the pull request's body.\n- `BLANK` - default to a blank commit message.")
    private Repository.MergeCommitMessage mergeCommitMessage;
    /**
     * Whether to allow merge commits for pull requests.
     *
     */
    @JsonProperty("allow_merge_commit")
    @JsonPropertyDescription("Whether to allow merge commits for pull requests.")
    private Boolean allowMergeCommit = true;
    /**
     * Whether to allow forking this repo
     *
     */
    @JsonProperty("allow_forking")
    @JsonPropertyDescription("Whether to allow forking this repo")
    private Boolean allowForking;
    /**
     * Whether to require contributors to sign off on web-based commits
     *
     */
    @JsonProperty("web_commit_signoff_required")
    @JsonPropertyDescription("Whether to require contributors to sign off on web-based commits")
    private Boolean webCommitSignoffRequired = false;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("open_issues")
    private Integer openIssues;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("watchers")
    private Integer watchers;
    @JsonProperty("master_branch")
    private String masterBranch;
    @JsonProperty("starred_at")
    private String starredAt;
    /**
     * Whether anonymous git access is enabled for this repository
     *
     */
    @JsonProperty("anonymous_access_enabled")
    @JsonPropertyDescription("Whether anonymous git access is enabled for this repository")
    private Boolean anonymousAccessEnabled;
    /**
     * The status of the code search index for this repository
     *
     */
    @JsonProperty("code_search_index_status")
    @JsonPropertyDescription("The status of the code search index for this repository")
    private CodeSearchIndexStatus codeSearchIndexStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Unique identifier of the repository
     * (Required)
     *
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Unique identifier of the repository
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * The name of the repository.
     * (Required)
     *
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the repository.
     * (Required)
     *
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("license")
    public Object getLicense() {
        return license;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("license")
    public void setLicense(Object license) {
        this.license = license;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks")
    public Integer getForks() {
        return forks;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks")
    public void setForks(Integer forks) {
        this.forks = forks;
    }

    @JsonProperty("permissions")
    public Permissions getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    /**
     * Simple User
     * <p>
     * A GitHub user.
     * (Required)
     *
     */
    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    /**
     * Simple User
     * <p>
     * A GitHub user.
     * (Required)
     *
     */
    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Whether the repository is private or public.
     * (Required)
     *
     */
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * Whether the repository is private or public.
     * (Required)
     *
     */
    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("fork")
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("archive_url")
    public String getArchiveUrl() {
        return archiveUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("archive_url")
    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("assignees_url")
    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("assignees_url")
    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("blobs_url")
    public String getBlobsUrl() {
        return blobsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("blobs_url")
    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("branches_url")
    public String getBranchesUrl() {
        return branchesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("branches_url")
    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("collaborators_url")
    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("collaborators_url")
    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("compare_url")
    public String getCompareUrl() {
        return compareUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("compare_url")
    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("contents_url")
    public String getContentsUrl() {
        return contentsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("contents_url")
    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("contributors_url")
    public URI getContributorsUrl() {
        return contributorsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("contributors_url")
    public void setContributorsUrl(URI contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("deployments_url")
    public URI getDeploymentsUrl() {
        return deploymentsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("deployments_url")
    public void setDeploymentsUrl(URI deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("downloads_url")
    public URI getDownloadsUrl() {
        return downloadsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("downloads_url")
    public void setDownloadsUrl(URI downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("events_url")
    public URI getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("events_url")
    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks_url")
    public URI getForksUrl() {
        return forksUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks_url")
    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_commits_url")
    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_commits_url")
    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_refs_url")
    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_refs_url")
    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_tags_url")
    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_tags_url")
    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("git_url")
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issue_comment_url")
    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issue_comment_url")
    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issue_events_url")
    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issue_events_url")
    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("languages_url")
    public URI getLanguagesUrl() {
        return languagesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("languages_url")
    public void setLanguagesUrl(URI languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("merges_url")
    public URI getMergesUrl() {
        return mergesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("merges_url")
    public void setMergesUrl(URI mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("milestones_url")
    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("milestones_url")
    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pulls_url")
    public String getPullsUrl() {
        return pullsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pulls_url")
    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("releases_url")
    public String getReleasesUrl() {
        return releasesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("releases_url")
    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("ssh_url")
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stargazers_url")
    public URI getStargazersUrl() {
        return stargazersUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stargazers_url")
    public void setStargazersUrl(URI stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("subscribers_url")
    public URI getSubscribersUrl() {
        return subscribersUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("subscribers_url")
    public void setSubscribersUrl(URI subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("subscription_url")
    public URI getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("subscription_url")
    public void setSubscriptionUrl(URI subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tags_url")
    public URI getTagsUrl() {
        return tagsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("tags_url")
    public void setTagsUrl(URI tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("teams_url")
    public URI getTeamsUrl() {
        return teamsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("teams_url")
    public void setTeamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("trees_url")
    public String getTreesUrl() {
        return treesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("trees_url")
    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("clone_url")
    public String getCloneUrl() {
        return cloneUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("clone_url")
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("mirror_url")
    public URI getMirrorUrl() {
        return mirrorUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("mirror_url")
    public void setMirrorUrl(URI mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("hooks_url")
    public URI getHooksUrl() {
        return hooksUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("hooks_url")
    public void setHooksUrl(URI hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("svn_url")
    public URI getSvnUrl() {
        return svnUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("svn_url")
    public void setSvnUrl(URI svnUrl) {
        this.svnUrl = svnUrl;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("homepage")
    public URI getHomepage() {
        return homepage;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("homepage")
    public void setHomepage(URI homepage) {
        this.homepage = homepage;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks_count")
    public Integer getForksCount() {
        return forksCount;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("forks_count")
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stargazers_count")
    public Integer getStargazersCount() {
        return stargazersCount;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("stargazers_count")
    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("watchers_count")
    public Integer getWatchersCount() {
        return watchersCount;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("watchers_count")
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    /**
     * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.
     * (Required)
     *
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * The size of the repository, in kilobytes. Size is calculated hourly. When a repository is initially created, the size is 0.
     * (Required)
     *
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * The default branch of the repository.
     * (Required)
     *
     */
    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * The default branch of the repository.
     * (Required)
     *
     */
    @JsonProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("open_issues_count")
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    /**
     * Whether this repository acts as a template that can be used to generate new repositories.
     *
     */
    @JsonProperty("is_template")
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    /**
     * Whether this repository acts as a template that can be used to generate new repositories.
     *
     */
    @JsonProperty("is_template")
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    @JsonProperty("topics")
    public List<String> getTopics() {
        return topics;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    /**
     * Whether issues are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    /**
     * Whether issues are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_issues")
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    /**
     * Whether projects are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_projects")
    public Boolean getHasProjects() {
        return hasProjects;
    }

    /**
     * Whether projects are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_projects")
    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    /**
     * Whether the wiki is enabled.
     * (Required)
     *
     */
    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    /**
     * Whether the wiki is enabled.
     * (Required)
     *
     */
    @JsonProperty("has_wiki")
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("has_pages")
    public Boolean getHasPages() {
        return hasPages;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("has_pages")
    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    /**
     * Whether downloads are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_downloads")
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    /**
     * Whether downloads are enabled.
     * (Required)
     *
     */
    @JsonProperty("has_downloads")
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    /**
     * Whether discussions are enabled.
     *
     */
    @JsonProperty("has_discussions")
    public Boolean getHasDiscussions() {
        return hasDiscussions;
    }

    /**
     * Whether discussions are enabled.
     *
     */
    @JsonProperty("has_discussions")
    public void setHasDiscussions(Boolean hasDiscussions) {
        this.hasDiscussions = hasDiscussions;
    }

    /**
     * Whether the repository is archived.
     * (Required)
     *
     */
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    /**
     * Whether the repository is archived.
     * (Required)
     *
     */
    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * Returns whether or not this repository disabled.
     * (Required)
     *
     */
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * Returns whether or not this repository disabled.
     * (Required)
     *
     */
    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * The repository visibility: public, private, or internal.
     *
     */
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    /**
     * The repository visibility: public, private, or internal.
     *
     */
    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pushed_at")
    public Date getPushedAt() {
        return pushedAt;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("pushed_at")
    public void setPushedAt(Date pushedAt) {
        this.pushedAt = pushedAt;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Whether to allow rebase merges for pull requests.
     *
     */
    @JsonProperty("allow_rebase_merge")
    public Boolean getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    /**
     * Whether to allow rebase merges for pull requests.
     *
     */
    @JsonProperty("allow_rebase_merge")
    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    @JsonProperty("temp_clone_token")
    public String getTempCloneToken() {
        return tempCloneToken;
    }

    @JsonProperty("temp_clone_token")
    public void setTempCloneToken(String tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    /**
     * Whether to allow squash merges for pull requests.
     *
     */
    @JsonProperty("allow_squash_merge")
    public Boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    /**
     * Whether to allow squash merges for pull requests.
     *
     */
    @JsonProperty("allow_squash_merge")
    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    /**
     * Whether to allow Auto-merge to be used on pull requests.
     *
     */
    @JsonProperty("allow_auto_merge")
    public Boolean getAllowAutoMerge() {
        return allowAutoMerge;
    }

    /**
     * Whether to allow Auto-merge to be used on pull requests.
     *
     */
    @JsonProperty("allow_auto_merge")
    public void setAllowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    /**
     * Whether to delete head branches when pull requests are merged
     *
     */
    @JsonProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    /**
     * Whether to delete head branches when pull requests are merged
     *
     */
    @JsonProperty("delete_branch_on_merge")
    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    /**
     * Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.
     *
     */
    @JsonProperty("allow_update_branch")
    public Boolean getAllowUpdateBranch() {
        return allowUpdateBranch;
    }

    /**
     * Whether or not a pull request head branch that is behind its base branch can always be updated even if it is not required to be up to date before merging.
     *
     */
    @JsonProperty("allow_update_branch")
    public void setAllowUpdateBranch(Boolean allowUpdateBranch) {
        this.allowUpdateBranch = allowUpdateBranch;
    }

    /**
     * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.
     *
     */
    @JsonProperty("use_squash_pr_title_as_default")
    public Boolean getUseSquashPrTitleAsDefault() {
        return useSquashPrTitleAsDefault;
    }

    /**
     * Whether a squash merge commit can use the pull request title as default. **This property is closing down. Please use `squash_merge_commit_title` instead.
     *
     */
    @JsonProperty("use_squash_pr_title_as_default")
    public void setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
    }

    /**
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     *
     */
    @JsonProperty("squash_merge_commit_title")
    public Repository.SquashMergeCommitTitle getSquashMergeCommitTitle() {
        return squashMergeCommitTitle;
    }

    /**
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     *
     */
    @JsonProperty("squash_merge_commit_title")
    public void setSquashMergeCommitTitle(Repository.SquashMergeCommitTitle squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
    }

    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     *
     */
    @JsonProperty("squash_merge_commit_message")
    public Repository.SquashMergeCommitMessage getSquashMergeCommitMessage() {
        return squashMergeCommitMessage;
    }

    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     *
     */
    @JsonProperty("squash_merge_commit_message")
    public void setSquashMergeCommitMessage(Repository.SquashMergeCommitMessage squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
    }

    /**
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     *
     */
    @JsonProperty("merge_commit_title")
    public Repository.MergeCommitTitle getMergeCommitTitle() {
        return mergeCommitTitle;
    }

    /**
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     *
     */
    @JsonProperty("merge_commit_title")
    public void setMergeCommitTitle(Repository.MergeCommitTitle mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
    }

    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     *
     */
    @JsonProperty("merge_commit_message")
    public Repository.MergeCommitMessage getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     *
     */
    @JsonProperty("merge_commit_message")
    public void setMergeCommitMessage(Repository.MergeCommitMessage mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }

    /**
     * Whether to allow merge commits for pull requests.
     *
     */
    @JsonProperty("allow_merge_commit")
    public Boolean getAllowMergeCommit() {
        return allowMergeCommit;
    }

    /**
     * Whether to allow merge commits for pull requests.
     *
     */
    @JsonProperty("allow_merge_commit")
    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    /**
     * Whether to allow forking this repo
     *
     */
    @JsonProperty("allow_forking")
    public Boolean getAllowForking() {
        return allowForking;
    }

    /**
     * Whether to allow forking this repo
     *
     */
    @JsonProperty("allow_forking")
    public void setAllowForking(Boolean allowForking) {
        this.allowForking = allowForking;
    }

    /**
     * Whether to require contributors to sign off on web-based commits
     *
     */
    @JsonProperty("web_commit_signoff_required")
    public Boolean getWebCommitSignoffRequired() {
        return webCommitSignoffRequired;
    }

    /**
     * Whether to require contributors to sign off on web-based commits
     *
     */
    @JsonProperty("web_commit_signoff_required")
    public void setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) {
        this.webCommitSignoffRequired = webCommitSignoffRequired;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("open_issues")
    public Integer getOpenIssues() {
        return openIssues;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("open_issues")
    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("watchers")
    public Integer getWatchers() {
        return watchers;
    }

    /**
     *
     * (Required)
     *
     */
    @JsonProperty("watchers")
    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    @JsonProperty("master_branch")
    public String getMasterBranch() {
        return masterBranch;
    }

    @JsonProperty("master_branch")
    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    @JsonProperty("starred_at")
    public String getStarredAt() {
        return starredAt;
    }

    @JsonProperty("starred_at")
    public void setStarredAt(String starredAt) {
        this.starredAt = starredAt;
    }

    /**
     * Whether anonymous git access is enabled for this repository
     *
     */
    @JsonProperty("anonymous_access_enabled")
    public Boolean getAnonymousAccessEnabled() {
        return anonymousAccessEnabled;
    }

    /**
     * Whether anonymous git access is enabled for this repository
     *
     */
    @JsonProperty("anonymous_access_enabled")
    public void setAnonymousAccessEnabled(Boolean anonymousAccessEnabled) {
        this.anonymousAccessEnabled = anonymousAccessEnabled;
    }

    /**
     * The status of the code search index for this repository
     *
     */
    @JsonProperty("code_search_index_status")
    public CodeSearchIndexStatus getCodeSearchIndexStatus() {
        return codeSearchIndexStatus;
    }

    /**
     * The status of the code search index for this repository
     *
     */
    @JsonProperty("code_search_index_status")
    public void setCodeSearchIndexStatus(CodeSearchIndexStatus codeSearchIndexStatus) {
        this.codeSearchIndexStatus = codeSearchIndexStatus;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    /**
     * The default value for a merge commit message.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `PR_BODY` - default to the pull request's body.
     * - `BLANK` - default to a blank commit message.
     *
     */
    @Generated("jsonschema2pojo")
    public enum MergeCommitMessage {

        PR_BODY("PR_BODY"),
        PR_TITLE("PR_TITLE"),
        BLANK("BLANK");
        private final String value;
        private final static Map<String, MergeCommitMessage> CONSTANTS = new HashMap<String, MergeCommitMessage>();

        static {
            for (Repository.MergeCommitMessage c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MergeCommitMessage(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Repository.MergeCommitMessage fromValue(String value) {
            Repository.MergeCommitMessage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The default value for a merge commit title.
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from branch-name).
     *
     */
    @Generated("jsonschema2pojo")
    public enum MergeCommitTitle {

        PR_TITLE("PR_TITLE"),
        MERGE_MESSAGE("MERGE_MESSAGE");
        private final String value;
        private final static Map<String, Repository.MergeCommitTitle> CONSTANTS = new HashMap<String, Repository.MergeCommitTitle>();

        static {
            for (Repository.MergeCommitTitle c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MergeCommitTitle(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Repository.MergeCommitTitle fromValue(String value) {
            Repository.MergeCommitTitle constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The default value for a squash merge commit message:
     *
     * - `PR_BODY` - default to the pull request's body.
     * - `COMMIT_MESSAGES` - default to the branch's commit messages.
     * - `BLANK` - default to a blank commit message.
     *
     */
    @Generated("jsonschema2pojo")
    public enum SquashMergeCommitMessage {

        PR_BODY("PR_BODY"),
        COMMIT_MESSAGES("COMMIT_MESSAGES"),
        BLANK("BLANK");
        private final String value;
        private final static Map<String, Repository.SquashMergeCommitMessage> CONSTANTS = new HashMap<String, Repository.SquashMergeCommitMessage>();

        static {
            for (Repository.SquashMergeCommitMessage c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SquashMergeCommitMessage(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Repository.SquashMergeCommitMessage fromValue(String value) {
            Repository.SquashMergeCommitMessage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * The default value for a squash merge commit title:
     *
     * - `PR_TITLE` - default to the pull request's title.
     * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more than one commit).
     *
     */
    @Generated("jsonschema2pojo")
    public enum SquashMergeCommitTitle {

        PR_TITLE("PR_TITLE"),
        COMMIT_OR_PR_TITLE("COMMIT_OR_PR_TITLE");
        private final String value;
        private final static Map<String, Repository.SquashMergeCommitTitle> CONSTANTS = new HashMap<String, Repository.SquashMergeCommitTitle>();

        static {
            for (Repository.SquashMergeCommitTitle c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SquashMergeCommitTitle(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Repository.SquashMergeCommitTitle fromValue(String value) {
            Repository.SquashMergeCommitTitle constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}