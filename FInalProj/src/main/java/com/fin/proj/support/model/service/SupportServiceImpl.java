package com.fin.proj.support.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.proj.common.model.vo.PageInfo;
import com.fin.proj.support.model.dao.SupportDAO;
import com.fin.proj.support.model.vo.Support;
import com.fin.proj.support.model.vo.SupportHistory;

@Service
public class SupportServiceImpl implements SupportService {

	@Autowired
	private SupportDAO suDAO;

	@Override
	public int supportApply(Support s) {
		return suDAO.supportApply(s);
	}


	@Override
	public ArrayList<Support> selectApplyListUser(PageInfo pi, int uNo) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectApplayListUser(rowBounds,uNo);
	}

	@Override
	public Support supportDetail(int supportNo) {
		return suDAO.supportDetail(supportNo);
	}

	@Override
	public int getListCount() {
		return suDAO.getListCount();
	}

	@Override
	public ArrayList<Support> selectSupportList(PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectSupportList(rowBounds);
	}

	@Override
	public int getWListCount() {
		return suDAO.getWListCount();
	}

	@Override
	public ArrayList<Support> selectApplyList(PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectApplyList(rowBounds);
	}

	@Override
	public int getDListCount(String devision) {
		return suDAO.getDListCount(devision);
	}

	@Override
	public ArrayList<Support> applyDevision(PageInfo pi, String devision) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		return suDAO.selectApplyDevision(rowBounds, devision);
	}

	@Override
	public int updateApplyStatus(Support s) {
		return suDAO.updateApplyStatus(s);
	}

	@Override
	public int getEListCount() {
		return suDAO.getEListCount();
	}

	@Override
	public ArrayList<Support> selectEndSupportList(PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		return suDAO.selectEndSupportList(rowBounds);
	}

	@Override
	public int getSeachListCount(String searchWord) {
		return suDAO.getSearchListCount(searchWord);
	}

	@Override
	public ArrayList<Support> selectSearchListAdmin(PageInfo pi, String searchWord) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectSearchListAdmin(rowBounds, searchWord);
	}

	@Override
	public int getSupporterListCount(int supportNo) {
		return suDAO.getSupporterListCount(supportNo);
	}

	@Override
	public ArrayList<SupportHistory> selectSupporterListEach(PageInfo pi, int supportNo) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectSupporterListEach(rowBounds, supportNo);
	}

	@Override
	public int getSupporterListAllCount() {
		return suDAO.getSupporterListAllCount();
	}

	@Override
	public ArrayList<SupportHistory> selectSupporterList(PageInfo pi) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectSupporterList(rowBounds);
	}

	@Override
	public int getMListCount(int uNo) {
		return suDAO.getMListCount(uNo);
	}

	@Override
	public ArrayList<SupportHistory> selectMySupportList(PageInfo pi, int uNo) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectMySupportList(rowBounds, uNo);
	}

	@Override
	public int getSearchListCount(Support s) {
		return suDAO.getsearchApplyListCount(s);
	}

	@Override
	public ArrayList<Support> selectApplySearchList(PageInfo pi, Support s) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectApplySearchList(rowBounds, s);
	}

	@Override
	public int insertSupporter(SupportHistory sh) {
		return suDAO.insertSupporter(sh);
	}

	@Override
	public int getSearchMyListCount(SupportHistory sh) {
		return suDAO.getSearchMyListCount(sh);
	}

	@Override
	public ArrayList<SupportHistory> searchMyList(PageInfo pi, SupportHistory sh) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.searchMyList(rowBounds, sh);
	}

	@Override
	public int getSearchEListCount(String searchWord) {
		return suDAO.searchEListCount(searchWord);
	}

	@Override
	public ArrayList<Support> selectSearchEndSupportList(PageInfo pi, String searchWord) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectSearchEndList(rowBounds, searchWord);
	}

	@Override
	public int getCategoryCount(Support s) {
		return suDAO.getCategoryCount(s);
	}

	@Override
	public ArrayList<Support> selectCategoryListAdmin(PageInfo pi, Support s) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.selectCategoryListAdmin(rowBounds, s);
	}


	@Override
	public int updateFundAmount(SupportHistory sh) {
		return suDAO.updateFundAmount(sh);
	}


	@Override
	public int getMyListCount(SupportHistory sh) {
		return suDAO.getMyListCount(sh);
	}


	@Override
	public ArrayList<SupportHistory> cateMySupportList(PageInfo pi, SupportHistory sh) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());

		return suDAO.cateMySupportList(rowBounds, sh);
	}


	@Override
	public int getDday(int supportNo) {
		return suDAO.getDday(supportNo);
	}


	@Override
	public int getApplyListUser(int uNo) {
		return suDAO.getApplyListUser(uNo);
	}


	@Override
	public int maintotalCount() {
		String result = suDAO.maintotalCount();
		int result1 = 0;
		if(result.equals("(null)")) {
			return 0;
		} else {
			return Integer.parseInt(suDAO.maintotalCount());
		}
	}


	@Override
	public int maintotalAmount() {
		String result = suDAO.maintotalAmount();
		int result1 = 0;
		if(result==null) {
			return 0;
		} else {
			return Integer.parseInt(suDAO.maintotalAmount());
		}
	}


	@Override
	public ArrayList<SupportHistory> currentSupporter(int supportNo) {
		return suDAO.currentSupporter(supportNo);
	}


	@Override
	public int getCateEndListCount(Support s) {
		return suDAO.getCateEndListCount(s);
	}


	@Override
	public ArrayList<Support> cateEndSupportList(PageInfo pi, Support s) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		return suDAO.cateEndSupportList(rowBounds, s);
	}


	@Override
	public int getApplyListCount(Support s) {
		return suDAO.getApplyListAdmin(s);
	}


	@Override
	public ArrayList<Support> applyListAdmin(PageInfo pi, Support s) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		
		return suDAO.applyListAdmin(rowBounds, s);
	}


	@Override
	public int updateSupport(Support s) {
		return suDAO.updateSupport(s);
	}


	@Override
	public int updateStartDate(int supportNo) {
		return suDAO.updateStartDate(supportNo);
	}

}
