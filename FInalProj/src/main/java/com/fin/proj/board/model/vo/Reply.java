package com.fin.proj.board.model.vo;

import java.sql.Date;

public class Reply {
	private int replyNo;
	private int replyWriter;
	private String nickName;
	private int boardNo;
	private String boardType;
	private String boardTitle;
	private String replyContent;
	private Date replyDate;
	private String replyTime;
	private char replyStatus;
	
	public Reply() {}

	public Reply(int replyNo, int replyWriter, String nickName, int boardNo, String boardType, String boardTitle,
			String replyContent, Date replyDate, String replyTime, char replyStatus) {
		super();
		this.replyNo = replyNo;
		this.replyWriter = replyWriter;
		this.nickName = nickName;
		this.boardNo = boardNo;
		this.boardType = boardType;
		this.boardTitle = boardTitle;
		this.replyContent = replyContent;
		this.replyDate = replyDate;
		this.replyTime = replyTime;
		this.replyStatus = replyStatus;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public int getReplyWriter() {
		return replyWriter;
	}

	public void setReplyWriter(int replyWriter) {
		this.replyWriter = replyWriter;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Date getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

	public String getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}

	public char getReplyStatus() {
		return replyStatus;
	}

	public void setReplyStatus(char replyStatus) {
		this.replyStatus = replyStatus;
	}

	@Override
	public String toString() {
		return "Reply [replyNo=" + replyNo + ", replyWriter=" + replyWriter + ", nickName=" + nickName + ", boardNo="
				+ boardNo + ", boardType=" + boardType + ", boardTitle=" + boardTitle + ", replyContent=" + replyContent
				+ ", replyDate=" + replyDate + ", replyTime=" + replyTime + ", replyStatus=" + replyStatus + "]";
	}

	
}
