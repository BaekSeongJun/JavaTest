package chapter10.page59;

import java.util.Arrays;
import java.util.Objects;

public class Recipe {
	//멤변(정변,인변,상수,  private)
	private String recipeName;
	private String[] ingredients;
	private int ingredientCount;
	private String[] step;
	private int stepCount;
	//생성자(디생,매생,오버로딩:시그너처틀려야됨, 접근제어자 자클)
	public Recipe() {
		this(null);
	}
	public Recipe(String recipeName) {
		this.recipeName = recipeName;
		ingredients = new String[5];
		ingredientCount = 0;
		step = new String[5];
		stepCount = 0;
	}
	//멤함(겟터,셋터: 캡슐화,기능, 출력, 오버로딩, public)
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String[] getIngredients() {
		return ingredients;
	}
	public String[] getStep() {
		return step;
	}
	public int getIngredientCount() {
		return ingredientCount;
	}
	public int getStepCount() {
		return stepCount;
	}
	//요리재료를 입력하는함수
	public void addIngredient(String ingredientName) {
		//재료배열에는 5개만가능한다.
		//재료배열갯수 체크한다. 5개이상이면 리턴, 5개이하이면재료배열저장
		if (ingredientCount >= 5) {
			System.out.println("더이상 재료공간부족합니다.");
			return;
		}
		ingredients[ingredientCount++] = ingredientName;
	}
	//요리진행단계 입력하는 함수
	public void addStep(String stepDescription) {
		//요리진행단계 배열에는 5개만가능한다.
		//요리진행배열갯수 체크한다. 5개이상이면 리턴, 5개이하이면요리단계배열저장
		if (stepCount >= 5) {
			System.out.println("더이상 요리진행공간부족합니다.");
			return;
		}
		step[stepCount++] = stepDescription;
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Recipe r)){
			return false;
		}
		return recipeName.equals(r.recipeName) && ingredientCount == r.ingredientCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(recipeName,ingredientCount);
	}

	@Override
	public String toString() {
		return "Recipe [recipeName=" + recipeName + ",\n ingredients=" + Arrays.toString(ingredients)
			+ ", ingredientCount=" + ingredientCount + ",\n step=" + Arrays.toString(step) + ", stepCount="
			+ stepCount + "]";
	}



}