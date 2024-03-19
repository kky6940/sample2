package com.ezen.koh2;

public class ScoreDTO {
	int id, kor,eng,mat, tot;
	MyinfoDTO myinfoDTO;
	InsaDTO insaDTO;

	public ScoreDTO() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public MyinfoDTO getMyinfoDTO() {
		return myinfoDTO;
	}

	public void setMyinfoDTO(MyinfoDTO myinfoDTO) {
		this.myinfoDTO = myinfoDTO;
	}

	public InsaDTO getInsaDTO() {
		return insaDTO;
	}

	public void setInsaDTO(InsaDTO insaDTO) {
		this.insaDTO = insaDTO;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}
	
}
