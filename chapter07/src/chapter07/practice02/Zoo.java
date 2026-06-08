package chapter07.practice02;

import java.util.Arrays;

public class Zoo {
	private static final int COUNT = 5;
	private String name;
	private String location;
	private String[] animals;
	private int animalCount;

	public Zoo() {
		this(null,null);
	}

	public Zoo(String zooName, String zooLocation) {
		this.name = zooName;
		this.location = zooLocation;
		animals = new String[COUNT];
		animalCount = 0;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAnimals() {
		return animals;
	}

	public void setAnimals(String[] animals) {
		this.animals = animals;
	}

	public int addAnimal(String animalName){
		if(animalCount >= animals.length){
			System.out.printf("%s 등록 실패!!\n 사유 : 현재 %s에는 최대 %d마리만 들어갈 수 있습니다.\n동물원을 증축해주세요!!!\n",animalName,name,animals.length);
			return -1;
		}
		animals[animalCount++] = animalName;
		return animalCount;
	}

	@Override
	public String toString() {
		return "Zoo{" +
			"name='" + name + '\'' +
			", location='" + location + '\'' +
			", animals=" + Arrays.toString(animals) +
			", animalCount=" + animalCount +
			'}';
	}

	public void showZooInfo(){
		System.out.printf("Zoo{" +
			"name='" + name + '\'' +
			", location='" + location + '\'' +
			", animals=" + Arrays.toString(animals) +
			", animalCount=" + animalCount +
			"}\n");
	}
}
