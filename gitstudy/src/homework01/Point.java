package homework01;


	/**
	 * 定义一个点类Point， 
	 * 包含2个成员变量x、y分别表示x和y坐标， 
	 * 2个构造方法Point()和Point(int x0,int y0),
	 * 以及一个movePoint（int dx,int dy）方法实现点的位置移动，
	 *  创建两个Point对象p1、p2，
	 * 分别调用movePoint方法后，打印p1和p2的坐标。
	 */
public class Point {
		// 横坐标我写的
		private int x;
		// 纵坐标我写的
		private int y;
	    //生成的
		public Point() {
			super();
			// TODO Auto-generated constructor stub
		}
		//生成的
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		/**
		 * 
		 * @param dx
		 *            横坐标
		 * @param dy
		 *            纵坐标
		 *            我写的
		 */
		public void movePoint(int dx, int dy) {
			this.x += dx;
			this.y += dy;
		}
		//生成的
		public int getX() {
			return x;
		}
		//生成的
		public int getY() {
			return y;
		}
	}

