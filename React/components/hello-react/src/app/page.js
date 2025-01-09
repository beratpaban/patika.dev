import Header from "@/components/Header";
import User from "@/components/User";
const name = "Berat";
const surname = "Paban";
const isLoggedIn=false;
export default function Home() {
  return (
    <>
    <User name="Berat" surname="Paban" isLoggedIn={false} friends={["Ahmet","Tayfun","Gökhan","Furkan"]}/>
      
    </>
  );
}
