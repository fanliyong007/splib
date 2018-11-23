package com.yixing.splib.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
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
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(Integer value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(Integer value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(Integer value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(Integer value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(Integer value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<Integer> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<Integer> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(Integer value1, Integer value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNull() {
            addCriterion("regdate is null");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNotNull() {
            addCriterion("regdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(Date value) {
            addCriterion("regdate =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(Date value) {
            addCriterion("regdate <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(Date value) {
            addCriterion("regdate >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(Date value) {
            addCriterion("regdate >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(Date value) {
            addCriterion("regdate <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(Date value) {
            addCriterion("regdate <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateIn(List<Date> values) {
            addCriterion("regdate in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotIn(List<Date> values) {
            addCriterion("regdate not in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(Date value1, Date value2) {
            addCriterion("regdate between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(Date value1, Date value2) {
            addCriterion("regdate not between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andBorrowedIsNull() {
            addCriterion("borrowed is null");
            return (Criteria) this;
        }

        public Criteria andBorrowedIsNotNull() {
            addCriterion("borrowed is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowedEqualTo(Integer value) {
            addCriterion("borrowed =", value, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedNotEqualTo(Integer value) {
            addCriterion("borrowed <>", value, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedGreaterThan(Integer value) {
            addCriterion("borrowed >", value, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowed >=", value, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedLessThan(Integer value) {
            addCriterion("borrowed <", value, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedLessThanOrEqualTo(Integer value) {
            addCriterion("borrowed <=", value, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedIn(List<Integer> values) {
            addCriterion("borrowed in", values, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedNotIn(List<Integer> values) {
            addCriterion("borrowed not in", values, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedBetween(Integer value1, Integer value2) {
            addCriterion("borrowed between", value1, value2, "borrowed");
            return (Criteria) this;
        }

        public Criteria andBorrowedNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowed not between", value1, value2, "borrowed");
            return (Criteria) this;
        }

        public Criteria andIscanceledIsNull() {
            addCriterion("iscanceled is null");
            return (Criteria) this;
        }

        public Criteria andIscanceledIsNotNull() {
            addCriterion("iscanceled is not null");
            return (Criteria) this;
        }

        public Criteria andIscanceledEqualTo(Boolean value) {
            addCriterion("iscanceled =", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotEqualTo(Boolean value) {
            addCriterion("iscanceled <>", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledGreaterThan(Boolean value) {
            addCriterion("iscanceled >", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iscanceled >=", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledLessThan(Boolean value) {
            addCriterion("iscanceled <", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledLessThanOrEqualTo(Boolean value) {
            addCriterion("iscanceled <=", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledIn(List<Boolean> values) {
            addCriterion("iscanceled in", values, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotIn(List<Boolean> values) {
            addCriterion("iscanceled not in", values, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledBetween(Boolean value1, Boolean value2) {
            addCriterion("iscanceled between", value1, value2, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iscanceled not between", value1, value2, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andCanceleddateIsNull() {
            addCriterion("canceleddate is null");
            return (Criteria) this;
        }

        public Criteria andCanceleddateIsNotNull() {
            addCriterion("canceleddate is not null");
            return (Criteria) this;
        }

        public Criteria andCanceleddateEqualTo(Date value) {
            addCriterion("canceleddate =", value, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateNotEqualTo(Date value) {
            addCriterion("canceleddate <>", value, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateGreaterThan(Date value) {
            addCriterion("canceleddate >", value, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateGreaterThanOrEqualTo(Date value) {
            addCriterion("canceleddate >=", value, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateLessThan(Date value) {
            addCriterion("canceleddate <", value, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateLessThanOrEqualTo(Date value) {
            addCriterion("canceleddate <=", value, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateIn(List<Date> values) {
            addCriterion("canceleddate in", values, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateNotIn(List<Date> values) {
            addCriterion("canceleddate not in", values, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateBetween(Date value1, Date value2) {
            addCriterion("canceleddate between", value1, value2, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andCanceleddateNotBetween(Date value1, Date value2) {
            addCriterion("canceleddate not between", value1, value2, "canceleddate");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andIdnumIsNull() {
            addCriterion("idnum is null");
            return (Criteria) this;
        }

        public Criteria andIdnumIsNotNull() {
            addCriterion("idnum is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumEqualTo(String value) {
            addCriterion("idnum =", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotEqualTo(String value) {
            addCriterion("idnum <>", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumGreaterThan(String value) {
            addCriterion("idnum >", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumGreaterThanOrEqualTo(String value) {
            addCriterion("idnum >=", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLessThan(String value) {
            addCriterion("idnum <", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLessThanOrEqualTo(String value) {
            addCriterion("idnum <=", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLike(String value) {
            addCriterion("idnum like", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotLike(String value) {
            addCriterion("idnum not like", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumIn(List<String> values) {
            addCriterion("idnum in", values, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotIn(List<String> values) {
            addCriterion("idnum not in", values, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumBetween(String value1, String value2) {
            addCriterion("idnum between", value1, value2, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotBetween(String value1, String value2) {
            addCriterion("idnum not between", value1, value2, "idnum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitIsNull() {
            addCriterion("brrowlimit is null");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitIsNotNull() {
            addCriterion("brrowlimit is not null");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitEqualTo(Integer value) {
            addCriterion("brrowlimit =", value, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitNotEqualTo(Integer value) {
            addCriterion("brrowlimit <>", value, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitGreaterThan(Integer value) {
            addCriterion("brrowlimit >", value, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("brrowlimit >=", value, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitLessThan(Integer value) {
            addCriterion("brrowlimit <", value, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitLessThanOrEqualTo(Integer value) {
            addCriterion("brrowlimit <=", value, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitIn(List<Integer> values) {
            addCriterion("brrowlimit in", values, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitNotIn(List<Integer> values) {
            addCriterion("brrowlimit not in", values, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitBetween(Integer value1, Integer value2) {
            addCriterion("brrowlimit between", value1, value2, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andBrrowlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("brrowlimit not between", value1, value2, "brrowlimit");
            return (Criteria) this;
        }

        public Criteria andIscompensatedIsNull() {
            addCriterion("iscompensated is null");
            return (Criteria) this;
        }

        public Criteria andIscompensatedIsNotNull() {
            addCriterion("iscompensated is not null");
            return (Criteria) this;
        }

        public Criteria andIscompensatedEqualTo(Boolean value) {
            addCriterion("iscompensated =", value, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedNotEqualTo(Boolean value) {
            addCriterion("iscompensated <>", value, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedGreaterThan(Boolean value) {
            addCriterion("iscompensated >", value, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("iscompensated >=", value, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedLessThan(Boolean value) {
            addCriterion("iscompensated <", value, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedLessThanOrEqualTo(Boolean value) {
            addCriterion("iscompensated <=", value, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedIn(List<Boolean> values) {
            addCriterion("iscompensated in", values, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedNotIn(List<Boolean> values) {
            addCriterion("iscompensated not in", values, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedBetween(Boolean value1, Boolean value2) {
            addCriterion("iscompensated between", value1, value2, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andIscompensatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("iscompensated not between", value1, value2, "iscompensated");
            return (Criteria) this;
        }

        public Criteria andCompensatedintIsNull() {
            addCriterion("compensatedint is null");
            return (Criteria) this;
        }

        public Criteria andCompensatedintIsNotNull() {
            addCriterion("compensatedint is not null");
            return (Criteria) this;
        }

        public Criteria andCompensatedintEqualTo(Integer value) {
            addCriterion("compensatedint =", value, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintNotEqualTo(Integer value) {
            addCriterion("compensatedint <>", value, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintGreaterThan(Integer value) {
            addCriterion("compensatedint >", value, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintGreaterThanOrEqualTo(Integer value) {
            addCriterion("compensatedint >=", value, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintLessThan(Integer value) {
            addCriterion("compensatedint <", value, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintLessThanOrEqualTo(Integer value) {
            addCriterion("compensatedint <=", value, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintIn(List<Integer> values) {
            addCriterion("compensatedint in", values, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintNotIn(List<Integer> values) {
            addCriterion("compensatedint not in", values, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintBetween(Integer value1, Integer value2) {
            addCriterion("compensatedint between", value1, value2, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andCompensatedintNotBetween(Integer value1, Integer value2) {
            addCriterion("compensatedint not between", value1, value2, "compensatedint");
            return (Criteria) this;
        }

        public Criteria andIsfinedIsNull() {
            addCriterion("isfined is null");
            return (Criteria) this;
        }

        public Criteria andIsfinedIsNotNull() {
            addCriterion("isfined is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinedEqualTo(Boolean value) {
            addCriterion("isfined =", value, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedNotEqualTo(Boolean value) {
            addCriterion("isfined <>", value, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedGreaterThan(Boolean value) {
            addCriterion("isfined >", value, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isfined >=", value, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedLessThan(Boolean value) {
            addCriterion("isfined <", value, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedLessThanOrEqualTo(Boolean value) {
            addCriterion("isfined <=", value, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedIn(List<Boolean> values) {
            addCriterion("isfined in", values, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedNotIn(List<Boolean> values) {
            addCriterion("isfined not in", values, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedBetween(Boolean value1, Boolean value2) {
            addCriterion("isfined between", value1, value2, "isfined");
            return (Criteria) this;
        }

        public Criteria andIsfinedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isfined not between", value1, value2, "isfined");
            return (Criteria) this;
        }

        public Criteria andFineintIsNull() {
            addCriterion("fineint is null");
            return (Criteria) this;
        }

        public Criteria andFineintIsNotNull() {
            addCriterion("fineint is not null");
            return (Criteria) this;
        }

        public Criteria andFineintEqualTo(Integer value) {
            addCriterion("fineint =", value, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintNotEqualTo(Integer value) {
            addCriterion("fineint <>", value, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintGreaterThan(Integer value) {
            addCriterion("fineint >", value, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintGreaterThanOrEqualTo(Integer value) {
            addCriterion("fineint >=", value, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintLessThan(Integer value) {
            addCriterion("fineint <", value, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintLessThanOrEqualTo(Integer value) {
            addCriterion("fineint <=", value, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintIn(List<Integer> values) {
            addCriterion("fineint in", values, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintNotIn(List<Integer> values) {
            addCriterion("fineint not in", values, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintBetween(Integer value1, Integer value2) {
            addCriterion("fineint between", value1, value2, "fineint");
            return (Criteria) this;
        }

        public Criteria andFineintNotBetween(Integer value1, Integer value2) {
            addCriterion("fineint not between", value1, value2, "fineint");
            return (Criteria) this;
        }

        public Criteria andColleageIdIsNull() {
            addCriterion("colleage_id is null");
            return (Criteria) this;
        }

        public Criteria andColleageIdIsNotNull() {
            addCriterion("colleage_id is not null");
            return (Criteria) this;
        }

        public Criteria andColleageIdEqualTo(String value) {
            addCriterion("colleage_id =", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdNotEqualTo(String value) {
            addCriterion("colleage_id <>", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdGreaterThan(String value) {
            addCriterion("colleage_id >", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdGreaterThanOrEqualTo(String value) {
            addCriterion("colleage_id >=", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdLessThan(String value) {
            addCriterion("colleage_id <", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdLessThanOrEqualTo(String value) {
            addCriterion("colleage_id <=", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdLike(String value) {
            addCriterion("colleage_id like", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdNotLike(String value) {
            addCriterion("colleage_id not like", value, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdIn(List<String> values) {
            addCriterion("colleage_id in", values, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdNotIn(List<String> values) {
            addCriterion("colleage_id not in", values, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdBetween(String value1, String value2) {
            addCriterion("colleage_id between", value1, value2, "colleageId");
            return (Criteria) this;
        }

        public Criteria andColleageIdNotBetween(String value1, String value2) {
            addCriterion("colleage_id not between", value1, value2, "colleageId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(String value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(String value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(String value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(String value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(String value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLike(String value) {
            addCriterion("major_id like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotLike(String value) {
            addCriterion("major_id not like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<String> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<String> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(String value1, String value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(String value1, String value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
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