package com.yixing.splib.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CatalogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CatalogExample() {
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

        public Criteria andSubnumIsNull() {
            addCriterion("subnum is null");
            return (Criteria) this;
        }

        public Criteria andSubnumIsNotNull() {
            addCriterion("subnum is not null");
            return (Criteria) this;
        }

        public Criteria andSubnumEqualTo(String value) {
            addCriterion("subnum =", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotEqualTo(String value) {
            addCriterion("subnum <>", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumGreaterThan(String value) {
            addCriterion("subnum >", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumGreaterThanOrEqualTo(String value) {
            addCriterion("subnum >=", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLessThan(String value) {
            addCriterion("subnum <", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLessThanOrEqualTo(String value) {
            addCriterion("subnum <=", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumLike(String value) {
            addCriterion("subnum like", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotLike(String value) {
            addCriterion("subnum not like", value, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumIn(List<String> values) {
            addCriterion("subnum in", values, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotIn(List<String> values) {
            addCriterion("subnum not in", values, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumBetween(String value1, String value2) {
            addCriterion("subnum between", value1, value2, "subnum");
            return (Criteria) this;
        }

        public Criteria andSubnumNotBetween(String value1, String value2) {
            addCriterion("subnum not between", value1, value2, "subnum");
            return (Criteria) this;
        }

        public Criteria andClassnumIsNull() {
            addCriterion("classnum is null");
            return (Criteria) this;
        }

        public Criteria andClassnumIsNotNull() {
            addCriterion("classnum is not null");
            return (Criteria) this;
        }

        public Criteria andClassnumEqualTo(String value) {
            addCriterion("classnum =", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotEqualTo(String value) {
            addCriterion("classnum <>", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThan(String value) {
            addCriterion("classnum >", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThanOrEqualTo(String value) {
            addCriterion("classnum >=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThan(String value) {
            addCriterion("classnum <", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThanOrEqualTo(String value) {
            addCriterion("classnum <=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLike(String value) {
            addCriterion("classnum like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotLike(String value) {
            addCriterion("classnum not like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumIn(List<String> values) {
            addCriterion("classnum in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotIn(List<String> values) {
            addCriterion("classnum not in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumBetween(String value1, String value2) {
            addCriterion("classnum between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotBetween(String value1, String value2) {
            addCriterion("classnum not between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNamesIsNull() {
            addCriterion("book_nameS is null");
            return (Criteria) this;
        }

        public Criteria andBookNamesIsNotNull() {
            addCriterion("book_nameS is not null");
            return (Criteria) this;
        }

        public Criteria andBookNamesEqualTo(String value) {
            addCriterion("book_nameS =", value, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesNotEqualTo(String value) {
            addCriterion("book_nameS <>", value, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesGreaterThan(String value) {
            addCriterion("book_nameS >", value, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesGreaterThanOrEqualTo(String value) {
            addCriterion("book_nameS >=", value, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesLessThan(String value) {
            addCriterion("book_nameS <", value, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesLessThanOrEqualTo(String value) {
            addCriterion("book_nameS <=", value, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesLike(String value) {
            addCriterion("book_nameS like", value, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesNotLike(String value) {
            addCriterion("book_nameS not like", value, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesIn(List<String> values) {
            addCriterion("book_nameS in", values, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesNotIn(List<String> values) {
            addCriterion("book_nameS not in", values, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesBetween(String value1, String value2) {
            addCriterion("book_nameS between", value1, value2, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookNamesNotBetween(String value1, String value2) {
            addCriterion("book_nameS not between", value1, value2, "bookNames");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsIsNull() {
            addCriterion("book_authorS is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsIsNotNull() {
            addCriterion("book_authorS is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsEqualTo(String value) {
            addCriterion("book_authorS =", value, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsNotEqualTo(String value) {
            addCriterion("book_authorS <>", value, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsGreaterThan(String value) {
            addCriterion("book_authorS >", value, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsGreaterThanOrEqualTo(String value) {
            addCriterion("book_authorS >=", value, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsLessThan(String value) {
            addCriterion("book_authorS <", value, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsLessThanOrEqualTo(String value) {
            addCriterion("book_authorS <=", value, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsLike(String value) {
            addCriterion("book_authorS like", value, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsNotLike(String value) {
            addCriterion("book_authorS not like", value, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsIn(List<String> values) {
            addCriterion("book_authorS in", values, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsNotIn(List<String> values) {
            addCriterion("book_authorS not in", values, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsBetween(String value1, String value2) {
            addCriterion("book_authorS between", value1, value2, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookAuthorsNotBetween(String value1, String value2) {
            addCriterion("book_authorS not between", value1, value2, "bookAuthors");
            return (Criteria) this;
        }

        public Criteria andBookVersionIsNull() {
            addCriterion("book_version is null");
            return (Criteria) this;
        }

        public Criteria andBookVersionIsNotNull() {
            addCriterion("book_version is not null");
            return (Criteria) this;
        }

        public Criteria andBookVersionEqualTo(String value) {
            addCriterion("book_version =", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionNotEqualTo(String value) {
            addCriterion("book_version <>", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionGreaterThan(String value) {
            addCriterion("book_version >", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionGreaterThanOrEqualTo(String value) {
            addCriterion("book_version >=", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionLessThan(String value) {
            addCriterion("book_version <", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionLessThanOrEqualTo(String value) {
            addCriterion("book_version <=", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionLike(String value) {
            addCriterion("book_version like", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionNotLike(String value) {
            addCriterion("book_version not like", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionIn(List<String> values) {
            addCriterion("book_version in", values, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionNotIn(List<String> values) {
            addCriterion("book_version not in", values, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionBetween(String value1, String value2) {
            addCriterion("book_version between", value1, value2, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionNotBetween(String value1, String value2) {
            addCriterion("book_version not between", value1, value2, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookPressIsNull() {
            addCriterion("book_press is null");
            return (Criteria) this;
        }

        public Criteria andBookPressIsNotNull() {
            addCriterion("book_press is not null");
            return (Criteria) this;
        }

        public Criteria andBookPressEqualTo(String value) {
            addCriterion("book_press =", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotEqualTo(String value) {
            addCriterion("book_press <>", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressGreaterThan(String value) {
            addCriterion("book_press >", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressGreaterThanOrEqualTo(String value) {
            addCriterion("book_press >=", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLessThan(String value) {
            addCriterion("book_press <", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLessThanOrEqualTo(String value) {
            addCriterion("book_press <=", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressLike(String value) {
            addCriterion("book_press like", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotLike(String value) {
            addCriterion("book_press not like", value, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressIn(List<String> values) {
            addCriterion("book_press in", values, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotIn(List<String> values) {
            addCriterion("book_press not in", values, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressBetween(String value1, String value2) {
            addCriterion("book_press between", value1, value2, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPressNotBetween(String value1, String value2) {
            addCriterion("book_press not between", value1, value2, "bookPress");
            return (Criteria) this;
        }

        public Criteria andBookPubdateIsNull() {
            addCriterion("book_pubdate is null");
            return (Criteria) this;
        }

        public Criteria andBookPubdateIsNotNull() {
            addCriterion("book_pubdate is not null");
            return (Criteria) this;
        }

        public Criteria andBookPubdateEqualTo(Date value) {
            addCriterion("book_pubdate =", value, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateNotEqualTo(Date value) {
            addCriterion("book_pubdate <>", value, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateGreaterThan(Date value) {
            addCriterion("book_pubdate >", value, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateGreaterThanOrEqualTo(Date value) {
            addCriterion("book_pubdate >=", value, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateLessThan(Date value) {
            addCriterion("book_pubdate <", value, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateLessThanOrEqualTo(Date value) {
            addCriterion("book_pubdate <=", value, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateIn(List<Date> values) {
            addCriterion("book_pubdate in", values, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateNotIn(List<Date> values) {
            addCriterion("book_pubdate not in", values, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateBetween(Date value1, Date value2) {
            addCriterion("book_pubdate between", value1, value2, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPubdateNotBetween(Date value1, Date value2) {
            addCriterion("book_pubdate not between", value1, value2, "bookPubdate");
            return (Criteria) this;
        }

        public Criteria andBookPageIsNull() {
            addCriterion("book_page is null");
            return (Criteria) this;
        }

        public Criteria andBookPageIsNotNull() {
            addCriterion("book_page is not null");
            return (Criteria) this;
        }

        public Criteria andBookPageEqualTo(Integer value) {
            addCriterion("book_page =", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotEqualTo(Integer value) {
            addCriterion("book_page <>", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageGreaterThan(Integer value) {
            addCriterion("book_page >", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_page >=", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageLessThan(Integer value) {
            addCriterion("book_page <", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageLessThanOrEqualTo(Integer value) {
            addCriterion("book_page <=", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageIn(List<Integer> values) {
            addCriterion("book_page in", values, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotIn(List<Integer> values) {
            addCriterion("book_page not in", values, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageBetween(Integer value1, Integer value2) {
            addCriterion("book_page between", value1, value2, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotBetween(Integer value1, Integer value2) {
            addCriterion("book_page not between", value1, value2, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNull() {
            addCriterion("book_price is null");
            return (Criteria) this;
        }

        public Criteria andBookPriceIsNotNull() {
            addCriterion("book_price is not null");
            return (Criteria) this;
        }

        public Criteria andBookPriceEqualTo(Integer value) {
            addCriterion("book_price =", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotEqualTo(Integer value) {
            addCriterion("book_price <>", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThan(Integer value) {
            addCriterion("book_price >", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_price >=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThan(Integer value) {
            addCriterion("book_price <", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceLessThanOrEqualTo(Integer value) {
            addCriterion("book_price <=", value, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceIn(List<Integer> values) {
            addCriterion("book_price in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotIn(List<Integer> values) {
            addCriterion("book_price not in", values, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceBetween(Integer value1, Integer value2) {
            addCriterion("book_price between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("book_price not between", value1, value2, "bookPrice");
            return (Criteria) this;
        }

        public Criteria andBookDateIsNull() {
            addCriterion("book_date is null");
            return (Criteria) this;
        }

        public Criteria andBookDateIsNotNull() {
            addCriterion("book_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookDateEqualTo(Date value) {
            addCriterion("book_date =", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateNotEqualTo(Date value) {
            addCriterion("book_date <>", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateGreaterThan(Date value) {
            addCriterion("book_date >", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateGreaterThanOrEqualTo(Date value) {
            addCriterion("book_date >=", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateLessThan(Date value) {
            addCriterion("book_date <", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateLessThanOrEqualTo(Date value) {
            addCriterion("book_date <=", value, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateIn(List<Date> values) {
            addCriterion("book_date in", values, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateNotIn(List<Date> values) {
            addCriterion("book_date not in", values, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateBetween(Date value1, Date value2) {
            addCriterion("book_date between", value1, value2, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookDateNotBetween(Date value1, Date value2) {
            addCriterion("book_date not between", value1, value2, "bookDate");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumIsNull() {
            addCriterion("book_remainnum is null");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumIsNotNull() {
            addCriterion("book_remainnum is not null");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumEqualTo(Integer value) {
            addCriterion("book_remainnum =", value, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumNotEqualTo(Integer value) {
            addCriterion("book_remainnum <>", value, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumGreaterThan(Integer value) {
            addCriterion("book_remainnum >", value, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_remainnum >=", value, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumLessThan(Integer value) {
            addCriterion("book_remainnum <", value, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumLessThanOrEqualTo(Integer value) {
            addCriterion("book_remainnum <=", value, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumIn(List<Integer> values) {
            addCriterion("book_remainnum in", values, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumNotIn(List<Integer> values) {
            addCriterion("book_remainnum not in", values, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumBetween(Integer value1, Integer value2) {
            addCriterion("book_remainnum between", value1, value2, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookRemainnumNotBetween(Integer value1, Integer value2) {
            addCriterion("book_remainnum not between", value1, value2, "bookRemainnum");
            return (Criteria) this;
        }

        public Criteria andBookNumIsNull() {
            addCriterion("book_num is null");
            return (Criteria) this;
        }

        public Criteria andBookNumIsNotNull() {
            addCriterion("book_num is not null");
            return (Criteria) this;
        }

        public Criteria andBookNumEqualTo(Integer value) {
            addCriterion("book_num =", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotEqualTo(Integer value) {
            addCriterion("book_num <>", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumGreaterThan(Integer value) {
            addCriterion("book_num >", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_num >=", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumLessThan(Integer value) {
            addCriterion("book_num <", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumLessThanOrEqualTo(Integer value) {
            addCriterion("book_num <=", value, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumIn(List<Integer> values) {
            addCriterion("book_num in", values, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotIn(List<Integer> values) {
            addCriterion("book_num not in", values, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumBetween(Integer value1, Integer value2) {
            addCriterion("book_num between", value1, value2, "bookNum");
            return (Criteria) this;
        }

        public Criteria andBookNumNotBetween(Integer value1, Integer value2) {
            addCriterion("book_num not between", value1, value2, "bookNum");
            return (Criteria) this;
        }

        public Criteria andCatalogManIsNull() {
            addCriterion("catalog_man is null");
            return (Criteria) this;
        }

        public Criteria andCatalogManIsNotNull() {
            addCriterion("catalog_man is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogManEqualTo(String value) {
            addCriterion("catalog_man =", value, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManNotEqualTo(String value) {
            addCriterion("catalog_man <>", value, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManGreaterThan(String value) {
            addCriterion("catalog_man >", value, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManGreaterThanOrEqualTo(String value) {
            addCriterion("catalog_man >=", value, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManLessThan(String value) {
            addCriterion("catalog_man <", value, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManLessThanOrEqualTo(String value) {
            addCriterion("catalog_man <=", value, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManLike(String value) {
            addCriterion("catalog_man like", value, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManNotLike(String value) {
            addCriterion("catalog_man not like", value, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManIn(List<String> values) {
            addCriterion("catalog_man in", values, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManNotIn(List<String> values) {
            addCriterion("catalog_man not in", values, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManBetween(String value1, String value2) {
            addCriterion("catalog_man between", value1, value2, "catalogMan");
            return (Criteria) this;
        }

        public Criteria andCatalogManNotBetween(String value1, String value2) {
            addCriterion("catalog_man not between", value1, value2, "catalogMan");
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

        public Criteria andIscanceledEqualTo(String value) {
            addCriterion("iscanceled =", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotEqualTo(String value) {
            addCriterion("iscanceled <>", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledGreaterThan(String value) {
            addCriterion("iscanceled >", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledGreaterThanOrEqualTo(String value) {
            addCriterion("iscanceled >=", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledLessThan(String value) {
            addCriterion("iscanceled <", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledLessThanOrEqualTo(String value) {
            addCriterion("iscanceled <=", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledLike(String value) {
            addCriterion("iscanceled like", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotLike(String value) {
            addCriterion("iscanceled not like", value, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledIn(List<String> values) {
            addCriterion("iscanceled in", values, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotIn(List<String> values) {
            addCriterion("iscanceled not in", values, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledBetween(String value1, String value2) {
            addCriterion("iscanceled between", value1, value2, "iscanceled");
            return (Criteria) this;
        }

        public Criteria andIscanceledNotBetween(String value1, String value2) {
            addCriterion("iscanceled not between", value1, value2, "iscanceled");
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