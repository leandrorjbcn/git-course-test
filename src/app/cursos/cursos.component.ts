import { Component } from '@angular/core';
import {Cursos} from './cursos';

@Component({
  selector: 'cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.css']
})
export class CursosComponent {
  
  	public titol: string;
	public cursos: Array<Cursos>;

constructor(){

		this.titol = 'CURSOS';

		this.cursos = [			
			new Cursos ('Java', 'Barcelona', '01/06/2018', '30/06/2018'),
			new Cursos ('C++', 'Lleida', '01/07/2018', '30/07/2018'),
			new Cursos ('Angular5', 'Tarragona', '01/08/2018', '30/08/2018')
			];

}


}