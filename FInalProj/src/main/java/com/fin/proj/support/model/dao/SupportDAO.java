package com.fin.proj.support.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import com.fin.proj.common.model.vo.PageInfo;
import com.fin.proj.support.model.vo.Support;
import com.fin.proj.support.model.vo.SupportHistory;

@Mapper
public interface SupportDAO {

	int supportApply(Support s);

	ArrayList<Support> selectApplayListUser(RowBounds rowBounds, int uNo);

	Support supportDetail(int supportNo);

	int getListCount();

	ArrayList<Support> selectSupportList(RowBounds rowBounds);

	int getWListCount();

	ArrayList<Support> selectApplyList(RowBounds rowBounds);

	int getDListCount(String devision);

	ArrayList<Support> selectApplyDevision(RowBounds rowBounds, String devision);

	int updateApplyStatus(Support s);

	int getEListCount();

	ArrayList<Support> selectEndSupportList(RowBounds rowBounds);

	int getSearchListCount(String searchWord);

	ArrayList<Support> selectSearchListAdmin(RowBounds rowBounds, String searchWord);

	int getSupporterListCount(int supportNo);

	ArrayList<SupportHistory> selectSupporterListEach(RowBounds rowBounds, int supportNo);

	int getSupporterListAllCount();

	ArrayList<SupportHistory> selectSupporterList(RowBounds rowBounds);

	int getMListCount(int uNo);

	ArrayList<SupportHistory> selectMySupportList(RowBounds rowBounds, int uNo);

	int getsearchApplyListCount(Support s);

	ArrayList<Support> selectApplySearchList(RowBounds rowBounds, Support s);

	int insertSupporter(SupportHistory sh);

	int getSearchMyListCount(SupportHistory sh);

	ArrayList<SupportHistory> searchMyList(RowBounds rowBounds, SupportHistory sh);

	int searchEListCount(String searchWord);

	ArrayList<Support> selectSearchEndList(RowBounds rowBounds, String searchWord);

	int getCategoryCount(Support s);

	ArrayList<Support> selectCategoryListAdmin(RowBounds rowBounds, Support s);

	int updateFundAmount(SupportHistory sh);

	int getMyListCount(SupportHistory sh);

	ArrayList<SupportHistory> cateMySupportList(RowBounds rowBounds, SupportHistory sh);

	int getDday(int supportNo);

	int getApplyListUser(int uNo);

	String maintotalCount();

	String maintotalAmount();

	ArrayList<SupportHistory> currentSupporter(int supportNo);

	int getCateEndListCount(Support s);

	ArrayList<Support> cateEndSupportList(RowBounds rowBounds, Support s);

	int getApplyListAdmin(Support s);

	ArrayList<Support> applyListAdmin(RowBounds rowBounds, Support s);

	int updateSupport(Support s);

	int updateStartDate(int supportNo);


}
