import { Component } from '@angular/core';
import {Noticies} from './noticies';

@Component({
  selector: 'noticies',
  templateUrl: './noticies.component.html',
  styleUrls: ['./noticies.component.css']
})

export class NoticiesComponent {
  
	public noticia: Noticies;
	public noticies: Array<Noticies>;


constructor(){

	this.noticia = new Noticies("", "", "", "", "");	

	this.noticies = [
					new Noticies("Bia", "Seidel", "Novela", "Primer Capitol", "Un molt bó començament"),
					];

}

onSubmit(){

	this.noticies.push(this.noticia);
	this.noticia = new Noticies ("", "", "", "", "");

}


}

