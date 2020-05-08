package top.fredyblog.blog.model.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> createTimeCriteria;

        protected List<Criterion> updateTimeCriteria;

        protected List<Criterion> delTimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
            createTimeCriteria = new ArrayList<>();
            updateTimeCriteria = new ArrayList<>();
            delTimeCriteria = new ArrayList<>();
        }

        public List<Criterion> getCreateTimeCriteria() {
            return createTimeCriteria;
        }

        protected void addCreateTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            createTimeCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addCreateTimeCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            createTimeCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getUpdateTimeCriteria() {
            return updateTimeCriteria;
        }

        protected void addUpdateTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            updateTimeCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addUpdateTimeCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            updateTimeCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getDelTimeCriteria() {
            return delTimeCriteria;
        }

        protected void addDelTimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            delTimeCriteria.add(new Criterion(condition, value, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        protected void addDelTimeCriterion(String condition, LocalDateTime value1, LocalDateTime value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            delTimeCriteria.add(new Criterion(condition, value1, value2, "org.apache.ibatis.type.LocalDateTimeTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || createTimeCriteria.size() > 0
                || updateTimeCriteria.size() > 0
                || delTimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(createTimeCriteria);
                allCriteria.addAll(updateTimeCriteria);
                allCriteria.addAll(delTimeCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andBlogFlagIsNull() {
            addCriterion("blog_flag is null");
            return (Criteria) this;
        }

        public Criteria andBlogFlagIsNotNull() {
            addCriterion("blog_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBlogFlagEqualTo(String value) {
            addCriterion("blog_flag =", value, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagNotEqualTo(String value) {
            addCriterion("blog_flag <>", value, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagGreaterThan(String value) {
            addCriterion("blog_flag >", value, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagGreaterThanOrEqualTo(String value) {
            addCriterion("blog_flag >=", value, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagLessThan(String value) {
            addCriterion("blog_flag <", value, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagLessThanOrEqualTo(String value) {
            addCriterion("blog_flag <=", value, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagLike(String value) {
            addCriterion("blog_flag like", value, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagNotLike(String value) {
            addCriterion("blog_flag not like", value, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagIn(List<String> values) {
            addCriterion("blog_flag in", values, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagNotIn(List<String> values) {
            addCriterion("blog_flag not in", values, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagBetween(String value1, String value2) {
            addCriterion("blog_flag between", value1, value2, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andBlogFlagNotBetween(String value1, String value2) {
            addCriterion("blog_flag not between", value1, value2, "blogFlag");
            return (Criteria) this;
        }

        public Criteria andTagIdStrIsNull() {
            addCriterion("tag_id_str is null");
            return (Criteria) this;
        }

        public Criteria andTagIdStrIsNotNull() {
            addCriterion("tag_id_str is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdStrEqualTo(String value) {
            addCriterion("tag_id_str =", value, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrNotEqualTo(String value) {
            addCriterion("tag_id_str <>", value, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrGreaterThan(String value) {
            addCriterion("tag_id_str >", value, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrGreaterThanOrEqualTo(String value) {
            addCriterion("tag_id_str >=", value, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrLessThan(String value) {
            addCriterion("tag_id_str <", value, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrLessThanOrEqualTo(String value) {
            addCriterion("tag_id_str <=", value, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrLike(String value) {
            addCriterion("tag_id_str like", value, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrNotLike(String value) {
            addCriterion("tag_id_str not like", value, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrIn(List<String> values) {
            addCriterion("tag_id_str in", values, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrNotIn(List<String> values) {
            addCriterion("tag_id_str not in", values, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrBetween(String value1, String value2) {
            addCriterion("tag_id_str between", value1, value2, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andTagIdStrNotBetween(String value1, String value2) {
            addCriterion("tag_id_str not between", value1, value2, "tagIdStr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrIsNull() {
            addCriterion("first_picture_addr is null");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrIsNotNull() {
            addCriterion("first_picture_addr is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrEqualTo(String value) {
            addCriterion("first_picture_addr =", value, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrNotEqualTo(String value) {
            addCriterion("first_picture_addr <>", value, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrGreaterThan(String value) {
            addCriterion("first_picture_addr >", value, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrGreaterThanOrEqualTo(String value) {
            addCriterion("first_picture_addr >=", value, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrLessThan(String value) {
            addCriterion("first_picture_addr <", value, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrLessThanOrEqualTo(String value) {
            addCriterion("first_picture_addr <=", value, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrLike(String value) {
            addCriterion("first_picture_addr like", value, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrNotLike(String value) {
            addCriterion("first_picture_addr not like", value, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrIn(List<String> values) {
            addCriterion("first_picture_addr in", values, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrNotIn(List<String> values) {
            addCriterion("first_picture_addr not in", values, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrBetween(String value1, String value2) {
            addCriterion("first_picture_addr between", value1, value2, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andFirstPictureAddrNotBetween(String value1, String value2) {
            addCriterion("first_picture_addr not between", value1, value2, "firstPictureAddr");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogDescIsNull() {
            addCriterion("blog_desc is null");
            return (Criteria) this;
        }

        public Criteria andBlogDescIsNotNull() {
            addCriterion("blog_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDescEqualTo(String value) {
            addCriterion("blog_desc =", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescNotEqualTo(String value) {
            addCriterion("blog_desc <>", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescGreaterThan(String value) {
            addCriterion("blog_desc >", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescGreaterThanOrEqualTo(String value) {
            addCriterion("blog_desc >=", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescLessThan(String value) {
            addCriterion("blog_desc <", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescLessThanOrEqualTo(String value) {
            addCriterion("blog_desc <=", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescLike(String value) {
            addCriterion("blog_desc like", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescNotLike(String value) {
            addCriterion("blog_desc not like", value, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescIn(List<String> values) {
            addCriterion("blog_desc in", values, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescNotIn(List<String> values) {
            addCriterion("blog_desc not in", values, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescBetween(String value1, String value2) {
            addCriterion("blog_desc between", value1, value2, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andBlogDescNotBetween(String value1, String value2) {
            addCriterion("blog_desc not between", value1, value2, "blogDesc");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Boolean value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Boolean value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Boolean value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Boolean value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Boolean> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Boolean> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andShareFlagIsNull() {
            addCriterion("share_flag is null");
            return (Criteria) this;
        }

        public Criteria andShareFlagIsNotNull() {
            addCriterion("share_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShareFlagEqualTo(Boolean value) {
            addCriterion("share_flag =", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagNotEqualTo(Boolean value) {
            addCriterion("share_flag <>", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagGreaterThan(Boolean value) {
            addCriterion("share_flag >", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("share_flag >=", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagLessThan(Boolean value) {
            addCriterion("share_flag <", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("share_flag <=", value, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagIn(List<Boolean> values) {
            addCriterion("share_flag in", values, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagNotIn(List<Boolean> values) {
            addCriterion("share_flag not in", values, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("share_flag between", value1, value2, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andShareFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("share_flag not between", value1, value2, "shareFlag");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(Boolean value) {
            addCriterion("published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(Boolean value) {
            addCriterion("published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(Boolean value) {
            addCriterion("published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(Boolean value) {
            addCriterion("published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(Boolean value) {
            addCriterion("published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<Boolean> values) {
            addCriterion("published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<Boolean> values) {
            addCriterion("published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(Boolean value1, Boolean value2) {
            addCriterion("published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("published not between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagIsNull() {
            addCriterion("appreciation_flag is null");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagIsNotNull() {
            addCriterion("appreciation_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagEqualTo(Boolean value) {
            addCriterion("appreciation_flag =", value, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagNotEqualTo(Boolean value) {
            addCriterion("appreciation_flag <>", value, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagGreaterThan(Boolean value) {
            addCriterion("appreciation_flag >", value, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("appreciation_flag >=", value, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagLessThan(Boolean value) {
            addCriterion("appreciation_flag <", value, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("appreciation_flag <=", value, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagIn(List<Boolean> values) {
            addCriterion("appreciation_flag in", values, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagNotIn(List<Boolean> values) {
            addCriterion("appreciation_flag not in", values, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("appreciation_flag between", value1, value2, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andAppreciationFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("appreciation_flag not between", value1, value2, "appreciationFlag");
            return (Criteria) this;
        }

        public Criteria andCommentabledIsNull() {
            addCriterion("commentabled is null");
            return (Criteria) this;
        }

        public Criteria andCommentabledIsNotNull() {
            addCriterion("commentabled is not null");
            return (Criteria) this;
        }

        public Criteria andCommentabledEqualTo(Boolean value) {
            addCriterion("commentabled =", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledNotEqualTo(Boolean value) {
            addCriterion("commentabled <>", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledGreaterThan(Boolean value) {
            addCriterion("commentabled >", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("commentabled >=", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledLessThan(Boolean value) {
            addCriterion("commentabled <", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledLessThanOrEqualTo(Boolean value) {
            addCriterion("commentabled <=", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledIn(List<Boolean> values) {
            addCriterion("commentabled in", values, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledNotIn(List<Boolean> values) {
            addCriterion("commentabled not in", values, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledBetween(Boolean value1, Boolean value2) {
            addCriterion("commentabled between", value1, value2, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("commentabled not between", value1, value2, "commentabled");
            return (Criteria) this;
        }

        public Criteria andBlogViewsIsNull() {
            addCriterion("blog_views is null");
            return (Criteria) this;
        }

        public Criteria andBlogViewsIsNotNull() {
            addCriterion("blog_views is not null");
            return (Criteria) this;
        }

        public Criteria andBlogViewsEqualTo(Integer value) {
            addCriterion("blog_views =", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsNotEqualTo(Integer value) {
            addCriterion("blog_views <>", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsGreaterThan(Integer value) {
            addCriterion("blog_views >", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_views >=", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsLessThan(Integer value) {
            addCriterion("blog_views <", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsLessThanOrEqualTo(Integer value) {
            addCriterion("blog_views <=", value, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsIn(List<Integer> values) {
            addCriterion("blog_views in", values, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsNotIn(List<Integer> values) {
            addCriterion("blog_views not in", values, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsBetween(Integer value1, Integer value2) {
            addCriterion("blog_views between", value1, value2, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_views not between", value1, value2, "blogViews");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsIsNull() {
            addCriterion("blog_comments is null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsIsNotNull() {
            addCriterion("blog_comments is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsEqualTo(Integer value) {
            addCriterion("blog_comments =", value, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsNotEqualTo(Integer value) {
            addCriterion("blog_comments <>", value, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsGreaterThan(Integer value) {
            addCriterion("blog_comments >", value, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_comments >=", value, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsLessThan(Integer value) {
            addCriterion("blog_comments <", value, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsLessThanOrEqualTo(Integer value) {
            addCriterion("blog_comments <=", value, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsIn(List<Integer> values) {
            addCriterion("blog_comments in", values, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsNotIn(List<Integer> values) {
            addCriterion("blog_comments not in", values, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsBetween(Integer value1, Integer value2) {
            addCriterion("blog_comments between", value1, value2, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogCommentsNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_comments not between", value1, value2, "blogComments");
            return (Criteria) this;
        }

        public Criteria andBlogLikesIsNull() {
            addCriterion("blog_likes is null");
            return (Criteria) this;
        }

        public Criteria andBlogLikesIsNotNull() {
            addCriterion("blog_likes is not null");
            return (Criteria) this;
        }

        public Criteria andBlogLikesEqualTo(Integer value) {
            addCriterion("blog_likes =", value, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesNotEqualTo(Integer value) {
            addCriterion("blog_likes <>", value, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesGreaterThan(Integer value) {
            addCriterion("blog_likes >", value, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_likes >=", value, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesLessThan(Integer value) {
            addCriterion("blog_likes <", value, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesLessThanOrEqualTo(Integer value) {
            addCriterion("blog_likes <=", value, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesIn(List<Integer> values) {
            addCriterion("blog_likes in", values, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesNotIn(List<Integer> values) {
            addCriterion("blog_likes not in", values, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesBetween(Integer value1, Integer value2) {
            addCriterion("blog_likes between", value1, value2, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andBlogLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_likes not between", value1, value2, "blogLikes");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCreateTimeCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCreateTimeCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCreateTimeCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCreateTimeCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCreateTimeCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCreateTimeCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCreateTimeCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCreateTimeCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCreateTimeCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCreateTimeCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addUpdateTimeCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addUpdateTimeCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addUpdateTimeCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addUpdateTimeCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addUpdateTimeCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addUpdateTimeCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addUpdateTimeCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addUpdateTimeCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addUpdateTimeCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addUpdateTimeCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Boolean value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Boolean value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Boolean value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Boolean value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Boolean> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Boolean> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNull() {
            addCriterion("del_time is null");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNotNull() {
            addCriterion("del_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelTimeEqualTo(LocalDateTime value) {
            addDelTimeCriterion("del_time =", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotEqualTo(LocalDateTime value) {
            addDelTimeCriterion("del_time <>", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThan(LocalDateTime value) {
            addDelTimeCriterion("del_time >", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addDelTimeCriterion("del_time >=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThan(LocalDateTime value) {
            addDelTimeCriterion("del_time <", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThanOrEqualTo(LocalDateTime value) {
            addDelTimeCriterion("del_time <=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeIn(List<LocalDateTime> values) {
            addDelTimeCriterion("del_time in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotIn(List<LocalDateTime> values) {
            addDelTimeCriterion("del_time not in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addDelTimeCriterion("del_time between", value1, value2, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addDelTimeCriterion("del_time not between", value1, value2, "delTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}