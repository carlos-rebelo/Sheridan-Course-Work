import { Component } from '@angular/core';
import { Student } from '../student';
import { CommonModule } from '@angular/common';
import {FormsModule} from '@angular/forms'
@Component({
  selector: 'app-content',
  imports: [CommonModule, FormsModule],
  templateUrl: './content.component.html',
  styleUrl: './content.component.css'
})
export class ContentComponent {

  currStudent:Student = {sid: 991729616, sname:"Carlos Rebelo", scampus: "Trafalgar", slogin:"rebeloca"}
  city = "Milton";
  clearCity() { this.city = ''; };
  mouse() { this.city = 'Mississauga'; }
  mouse2() { this.city = 'Toronto'; }
  details = 'New paragraph';
  image = 'kame.png'
}
