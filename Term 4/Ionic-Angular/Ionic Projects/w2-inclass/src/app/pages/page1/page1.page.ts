import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar, IonItem, IonLabel, IonInput } from '@ionic/angular/standalone';
import { C1Component } from 'src/app/c1/c1.component';
import { Man } from 'src/app/interfaces/man';

@Component({
  selector: 'app-page1',
  templateUrl: './page1.page.html',
  styleUrls: ['./page1.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule, C1Component, IonItem, IonLabel, IonInput,]
})

export class Page1Page implements OnInit {
  man:Man = {
    fName:'',
    lName:'',
    nName:''
  };
  constructor() { 
    this.man = {
      fName:'Carlos',
      lName:'Rebelo',
      nName:'What'
    }
  }

  ngOnInit() {
    this.man = {
      fName:'Carlos',
      lName:'Rebelo',
      nName:'What'
    }
  }

}
