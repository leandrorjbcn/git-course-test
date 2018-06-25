import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { CursosComponent } from './cursos/cursos.component';
import { HomeComponent } from './home/home.component';
import { NoticiesComponent } from './noticies/noticies.component';
import { ProfessoratComponent } from './professorat/professorat.component';

import { AppComponent } from './app.component';
import { routing, appRoutingProviders } from './app.routing';


@NgModule({
  declarations: [
    AppComponent,
    CursosComponent,
    HomeComponent,
    NoticiesComponent,
    ProfessoratComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    routing
  ],
  providers: [appRoutingProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
