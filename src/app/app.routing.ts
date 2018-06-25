import { ModuleWithProviders } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';

// {nom de la clase}               'ruta de l'arxiu que té la clase'
import { CursosComponent } from './cursos/cursos.component';
import { HomeComponent } from './home/home.component';
import { NoticiesComponent } from './noticies/noticies.component';
import { ProfessoratComponent } from './professorat/professorat.component';

const appRoutes: Routes =[

	{path: '', component: HomeComponent},	
	{path: 'home', component: HomeComponent},
	{path: 'cursos', component: CursosComponent},
	{path: 'noticies', component: NoticiesComponent},
	{path: 'professorat', component: ProfessoratComponent},
	{path: '**', component: HomeComponent}
];

export const appRoutingProviders: any[] = [];

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);