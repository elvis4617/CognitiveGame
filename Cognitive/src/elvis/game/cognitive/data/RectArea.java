package elvis.game.cognitive.data;

import android.graphics.RectF;

public class RectArea {

	public int mMinX;

	public int mMinY;

	public int mMaxX;

	public int mMaxY;

	public RectF getRectF() {
		return new RectF(mMinX, mMinY, mMaxX, mMaxY);
	}

	public RectArea(int minX, int minY, int size) {
		this.mMinX = minX;
		this.mMinY = minY;
		this.mMaxX = minX + size;
		this.mMaxY = minY + size;
	}

	public RectArea(int minX, int minY, int maxX, int maxY) {
		this.mMinX = minX;
		this.mMinY = minY;
		this.mMaxX = maxX;
		this.mMaxY = maxY;
	}
}
