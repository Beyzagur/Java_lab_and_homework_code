public class RowNode {
	private String rowNo;
	private RowNode down;
	private ElementNode rigth;

	public RowNode(String dataToAdd) {
		this.rowNo = dataToAdd;
		this.down = null;
		this.rigth = null;
	}

	public String getRowNo() {
		return rowNo;
	}

	public void setRowNo(String data) {
		this.rowNo = data;
	}

	public RowNode getDown() {
		return down;
	}

	public void setDown(RowNode down) {
		this.down = down;
	}

	public ElementNode getRigth() {
		return rigth;
	}

	public void setRigth(ElementNode rigth) {
		this.rigth = rigth;
	}

}
